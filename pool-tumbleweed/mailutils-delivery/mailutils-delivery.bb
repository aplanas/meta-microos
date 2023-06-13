SUMMARY = "Mailutils's delivery agents"
DESCRIPTION = "The name 'maidag' stands for Mail delivery agent.  It is a \
general-purpose MDA offering a number of features. It can operate \
both in traditional mode, reading a message from standard input, \
and in LMTP mode.  'Maidag' is able to deliver mail to any mailbox \
format supported by GNU Mailutils. These formats, among others, \
include 'smtp://', 'prog://' and 'sendmail://', which are equivalent to \
forwarding a message over SMTP to a remote node."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-delivery-3.16-1.2.aarch64.rpm"
RPM_HASH = "6c059b1d591a96041bb7bd17cf7da7c9bbf63d62f15a0213b31b87f169add41103d31370255d7988eecbbd71972bfeef8337a9b9d7dc84730f82c58f8c51d028"

RPROVIDES:${PN} += "mailutils-delivery \
mailutils-delivery(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libguile-3.0.so.1()(64bit) \
libguile-3.0.so.1(GUILE_2.0)(64bit) \
libmailutils.so.9()(64bit) \
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
libwrap.so.0()(64bit)"

inherit rpm
