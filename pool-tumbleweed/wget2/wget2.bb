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

RPM_NAME = "wget2-2.0.1-1.6.aarch64.rpm"
RPM_HASH = "7bd2dbb15628e9d87bc5707cc57053a6d1183efda7f98794711a09f536af96fc529cbda059bc2ebc94c4ea23bae5e79067051b4b37a614a5ebe79a758d6ecc7b"

RPROVIDES:${PN} += "wget2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libwget.so.1"

inherit rpm
