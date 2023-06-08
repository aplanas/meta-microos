SUMMARY = "A Tool for Transferring Data from URLs"
DESCRIPTION = "Curl is a client to get documents and files from or send documents to a \
server using any of the supported protocols (HTTP, HTTPS, FTP, FTPS, \
TFTP, DICT, TELNET, LDAP, or FILE). The command is designed to work \
without user interaction or any kind of interactivity."
LICENSE = "curl"

PV = "8.0.1"

RPM_NAME = "curl-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "c980a409de8dd800afc11cbc8ac46350014ba02bb86ddb57ede605af6e25d40b355b97a6f8ffb7e60d8a4dffa4bf9dcf4c0e68a6220b2006a2d754f077fc504e"

RPROVIDES:${PN} += "curl curl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libcurl4 libz.so.1()(64bit)"

inherit rpm
