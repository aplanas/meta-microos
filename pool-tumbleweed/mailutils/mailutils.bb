SUMMARY = "GNU Mailutils"
DESCRIPTION = "Mailutils is a set of utilities and daemons for processing e-mail. \
 \
All Mailutils programs are able to operate on mailboxes of various \
formats, including UNIX maildrops, maildir, and transparently \
accessed remote mailboxes (IMAP4, POP3, SMTP). \
 \
Included is an implementation of the traditional UNIX mail reader, \
'mail', command line utilities such as 'frm', 'messages', 'readmsg', \
as well as 'sieve', a flexible utility for filtering the incoming \
mail. \
 \
A special feature of Mailutils is an implementation of the \
MH Message Handling System, which combines the UNIX \
philosophy with a flexibility of Mailutils libraries, thus \
allowing to incorporate mail from remote mailboxes. \
 \
For system administrators, Mailutils provides a set of daemons \
for delivering and reading electronic mail, including \
pop3d, imap4d and a universal mail delivery agent, called maidag."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-3.16-1.2.aarch64.rpm"
RPM_HASH = "dd23f01adaadcbe9940ceb7e095d8a6acbae0a14cfc4a2a1f4317fc25c0adeccd908ef09b89d1b9aade65b616304fb84190987e3a01de7fcc3192a4065dea2c4"

RPROVIDES:${PN} += "mailutils \
mailutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
alts \
cups \
guile \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfribidi.so.0()(64bit) \
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
libmu_sieve.so.9()(64bit) \
libmuaux.so.9()(64bit) \
libreadline.so.8()(64bit) \
libunistring.so.5()(64bit) \
python(abi)"

inherit rpm
