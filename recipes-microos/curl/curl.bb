SUMMARY = "A Tool for Transferring Data from URLs"
DESCRIPTION = "Curl is a client to get documents and files from or send documents to a \
server using any of the supported protocols (HTTP, HTTPS, FTP, FTPS, \
TFTP, DICT, TELNET, LDAP, or FILE). The command is designed to work \
without user interaction or any kind of interactivity."
LICENSE = "curl"

PV = "8.1.2"

RPM_NAME = "curl-8.1.2-1.1.aarch64.rpm"
RPM_HASH = "5393e93d6fe73484b4ad5b1b061f5b91b6ed7f728e275b1955b88ee5ad72ba7dc5698e8488cd73789debe79fb023feb25863b954ac02fa94588f0ca4b52ad0d0"

RPROVIDES:${PN} += "curl \
curl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libcurl4 \
libz.so.1()(64bit)"

inherit rpm
