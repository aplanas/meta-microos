SUMMARY = "Game oriented network API"
DESCRIPTION = "The Hawk Network Library is a wrapper over Berkeley/Unix Sockets. NL \
provides support for groups of sockets, socket statistics, high \
accuracy timer, CRC functions, macros to read and write data to \
packets with endian conversion, and support for multiple network \
transports."
LICENSE = "LGPL-2.1+"

PV = "1.6.8"

RPM_NAME = "hawknl-libs-1.6.8-1.23.aarch64.rpm"
RPM_HASH = "79f99269bf69dd7472dc1d56d7f37f73a0758064d01f2875b755584b7d496af6339a886c6487245fef10de8df33f7b47f72e31fecc5ea861e355dd6ce92845f2"

RPROVIDES:${PN} += "hawknl-libs \
hawknl-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
