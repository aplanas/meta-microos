SUMMARY = "A mail filtering utility"
DESCRIPTION = "IMAPFilter is a mail filtering utility. It connects to remote mail \
servers using the Internet Message Access Protocol (IMAP), sends \
searching queries to the server and processes mailboxes based on the \
results. It can be used to delete, copy, move, flag, etc. messages \
residing in mailboxes at the same or different mail servers. The 4rev1 \
and 4 versions of the IMAP protocol are supported. \
 \
IMAPFilter uses the Lua programming language as a configuration and \
extension language."
LICENSE = "MIT"

PV = "2.8.1"

RPM_NAME = "imapfilter-2.8.1-1.1.aarch64.rpm"
RPM_HASH = "610f72a057fe8e5746b139bb328c7709453810bbbf43e7702abfa9d55e1ea373fdac4751ba3527ed238c05f1f48b8afeba53c46bcd2fca4fb09d69be3b3104c4"

RPROVIDES:${PN} += "imapfilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblua5.4.so.5 \
libpcre2-8.so.0 \
libssl.so.3"

inherit rpm
