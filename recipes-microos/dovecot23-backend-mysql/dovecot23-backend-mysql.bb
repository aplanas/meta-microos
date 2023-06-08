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

RPM_NAME = "dovecot23-backend-mysql-2.3.20-3.1.aarch64.rpm"
RPM_HASH = "bb0cec1cc2c6ba3587af0286234ef600865d7fc185a527216d302266dc0671d086f7afee47dfb6bf6519e25abaae13be46530283371417454ae0d3ec70ad6c42"

RPROVIDES:${PN} += "dovecot-backend-mysql dovecot23-backend-mysql dovecot23-backend-mysql(aarch-64) dovecot_sql_backend libdriver_mysql.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
