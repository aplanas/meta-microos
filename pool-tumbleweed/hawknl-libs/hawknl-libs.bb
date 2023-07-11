SUMMARY = "Game oriented network API"
DESCRIPTION = "The Hawk Network Library is a wrapper over Berkeley/Unix Sockets. NL \
provides support for groups of sockets, socket statistics, high \
accuracy timer, CRC functions, macros to read and write data to \
packets with endian conversion, and support for multiple network \
transports."
LICENSE = "LGPL-2.1+"

PV = "1.6.8"

RPM_NAME = "hawknl-libs-1.6.8-1.24.aarch64.rpm"
RPM_HASH = "d61f6af0117e432a6636f3accc61a94ca9886c04752c23ff0fa9099460adeca1840540c75887863556e1eea62bc3bdafae9f656812e176ed0b1ab7b967ef1315"

RPROVIDES:${PN} += "hawknl-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
