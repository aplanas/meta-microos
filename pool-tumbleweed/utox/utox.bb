SUMMARY = "The lightweight Tox client"
DESCRIPTION = "Lightweight Tox client."
LICENSE = "MIT"

PV = "0.18.1"

RPM_NAME = "utox-0.18.1-1.14.aarch64.rpm"
RPM_HASH = "16a9f65fd5724f67525cbbf5a5d591fc6b55eb0ffe9fc42a35c7609ecd9feaf8a5d9e94730acc75c78c7efbec55c359288caaf78f23b36728eb8f69f12eead85"

RPROVIDES:${PN} += "utox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfilteraudio.so.0 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libopenal.so.1 \
libtoxcore.so.2 \
libv4lconvert.so.0 \
libvpx.so.8"

inherit rpm
