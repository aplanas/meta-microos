SUMMARY = "A website access log visualization tool"
DESCRIPTION = "Logstalgia is a website traffic visualization that replays or streams \
Apache web-server access logs as a pong-like battle between the web \
server and an never ending torrent of requests. Requests appear as \
colored balls (the same color as the host) which travel across the \
screen to arrive at the requested location. Successful requests are \
hit by the paddle while unsuccessful ones (eg 404 - File Not Found) \
are missed and pass through."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "logstalgia-1.1.4-1.4.aarch64.rpm"
RPM_HASH = "da9b9238f4a700849e878d62198c5177f6edda5ae2c6aa328671f66e517bc4aa52f6077160fdb66fae91801bf3fe232ce906d457d6299280ec0a7935cc144238"

RPROVIDES:${PN} += "logstalgia"

RDEPENDS:${PN} += "freefont \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
