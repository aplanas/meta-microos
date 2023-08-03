SUMMARY = "Development files for the curl library"
DESCRIPTION = "Curl is a client to get documents and files from or send documents to a \
server using any of the supported protocols (HTTP, HTTPS, FTP, GOPHER, \
DICT, TELNET, LDAP, or FILE). The command is designed to work without \
user interaction or any kind of interactivity."
LICENSE = "curl"

PV = "8.2.1"

RPM_NAME = "libcurl-devel-8.2.1-1.1.aarch64.rpm"
RPM_HASH = "72e24844016b5e5986a3e0ce704ac54fedfe3e2b08ae0672520dfcdb2750ef4e074a1a47ecdf848345c9e44dbd6a44d6d91178223b89e14b06b7d0309112dfe6"

RPROVIDES:${PN} += "curl-devel \
libcurl-devel \
pkgconfig-libcurl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libcurl4"

inherit rpm
