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

RPROVIDES:${PN} += "logstalgia \
logstalgia(aarch-64)"

RDEPENDS:${PN} += "freefont \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libGLU.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcre2-8.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
