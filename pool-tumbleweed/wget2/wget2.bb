SUMMARY = "A Tool for Mirroring FTP and HTTP Servers"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a \
server. This can be done in script files or via the command line. \
 \
In many cases Wget2 downloads much faster than Wget1.x due to HTTP \
zlib compression, parallel connections and use of If-Modified-Since \
HTTP header. HTTP/2 has been implemented. Wget2 also consumes less \
system and user CPU cycles than Wget1.x."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "wget2-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "be834579e3307883462ad520f15cbddb6f2fdb3019913076a172b3acce79ee950c89f66d511073b73eec2cdacd6a3b0a1aa92706bf7b448fffcff70ee8124e2a"

RPROVIDES:${PN} += "wget2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libwget.so.2"

inherit rpm
