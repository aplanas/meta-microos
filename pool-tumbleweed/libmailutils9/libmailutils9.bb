SUMMARY = "Generalized mailbox access library"
DESCRIPTION = "At the core of Mailutils is 'libmailutils', a library which provides \
an API for accessing a generalized mailbox.  A set of complementary \
libraries provide methods for handling particular mailbox \
implementations: UNIX mailbox, Maildir, MH, POP3, IMAP4, even SMTP."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "libmailutils9-3.16-1.2.aarch64.rpm"
RPM_HASH = "56d59225a2d2bce8e8303dab99c3a2045d92f6b4c06215b2c34a53a695b5b6a5f4582eedb9a7c805f8fec7135ee7da8d6acf2fe43198778d1c9b2402d2fae8c1"

RPROVIDES:${PN} += "libmailutils.so.9()(64bit) \
libmailutils9 \
libmailutils9(aarch-64) \
libmu_auth.so.9()(64bit) \
libmu_dbm.so.9()(64bit) \
libmu_dotmail.so.9()(64bit) \
libmu_imap.so.9()(64bit) \
libmu_maildir.so.9()(64bit) \
libmu_mailer.so.9()(64bit) \
libmu_mbox.so.9()(64bit) \
libmu_mh.so.9()(64bit) \
libmu_pop.so.9()(64bit) \
libmu_py.so.9()(64bit) \
libmu_scm.so.9()(64bit) \
libmu_sieve.so.9()(64bit) \
libmuaux.so.9()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgsasl.so.7()(64bit) \
libguile-3.0.so.1()(64bit) \
libkyotocabinet.so.16()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libltdl.so.7()(64bit) \
libpam.so.0()(64bit) \
libpython3.10.so.1.0()(64bit)"

inherit rpm
