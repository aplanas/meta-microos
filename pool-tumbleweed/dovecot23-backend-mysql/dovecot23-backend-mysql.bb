SUMMARY = "MySQL support for Dovecot"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for MySQL support."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-backend-mysql-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "2aa18d860203c70ec5c2501179212f765f6f4c171cd19077bd99ebcee87ea898d5b5d0bb7d1c142eb87dc35effc6b6bcf026277989f297bcfef8c95bd8eea468"

RPROVIDES:${PN} += "dovecot-backend-mysql \
dovecot23-backend-mysql \
dovecot23-backend-mysql(aarch-64) \
dovecot_sql_backend \
libdriver_mysql.so()(64bit)"

RDEPENDS:${PN} += "dovecot23 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
