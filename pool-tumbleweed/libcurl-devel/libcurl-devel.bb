SUMMARY = "Development files for the curl library"
DESCRIPTION = "Curl is a client to get documents and files from or send documents to a \
server using any of the supported protocols (HTTP, HTTPS, FTP, GOPHER, \
DICT, TELNET, LDAP, or FILE). The command is designed to work without \
user interaction or any kind of interactivity."
LICENSE = "curl"

PV = "8.1.2"

RPM_NAME = "libcurl-devel-8.1.2-1.1.aarch64.rpm"
RPM_HASH = "eb431723ee73f8abf0581529fe940ccb4d28464093ed3ffbecd39e84c3ac8cf4f52f8032c1991adefc80b1919bf2d05ab9d9e30ede1d8bfddc9bab6d41b8c365"

RPROVIDES:${PN} += "curl-devel \
libcurl-devel \
pkgconfig-libcurl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libcurl4"

inherit rpm
