SUMMARY = "A Tool for Mirroring FTP and HTTP Servers"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a \
server. This can be done in script files or via the command line. \
 \
In many cases Wget2 downloads much faster than Wget1.x due to HTTP \
zlib compression, parallel connections and use of If-Modified-Since \
HTTP header. HTTP/2 has been implemented. Wget2 also consumes less \
system and user CPU cycles than Wget1.x."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "wget2-2.0.1-1.5.aarch64.rpm"
RPM_HASH = "72615d910f7a7e9d691d75ff64a85f0fe5af0cca4854366d5cc9894b1a701d4a96443ca588ade91d80c48f3c2af25decfec205f30bb9e1332085319ce8b595ab"

RPROVIDES:${PN} += "wget2 \
wget2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcre2-8.so.0()(64bit) \
libwget.so.1()(64bit)"

inherit rpm
