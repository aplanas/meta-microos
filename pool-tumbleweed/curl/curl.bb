SUMMARY = "A Tool for Transferring Data from URLs"
DESCRIPTION = "Curl is a client to get documents and files from or send documents to a \
server using any of the supported protocols (HTTP, HTTPS, FTP, FTPS, \
TFTP, DICT, TELNET, LDAP, or FILE). The command is designed to work \
without user interaction or any kind of interactivity."
LICENSE = "curl"

PV = "8.2.1"

RPM_NAME = "curl-8.2.1-1.1.aarch64.rpm"
RPM_HASH = "a8caf7e1a2dc249b2a92d909a524f396d898351d012165ebe3c638b904ea50b8a6c0a026a02debf71614949f4e93e88bb23191c49869ac02a73c7fcee696e144"

RPROVIDES:${PN} += "curl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libcurl4 \
libz.so.1"

inherit rpm
