SUMMARY = "Library to read & write Dolby Vision metadata"
DESCRIPTION = "Library to read & write Dolby Vision metadata"
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "libdovi3-3.1.2-2.2.aarch64.rpm"
RPM_HASH = "6518ee37f16f94ef3bfffef57329aa8515c6becd54cdf42d29f6e6d8cd168f02aa6bec6cce587da11ec6ec7fbf57b0beca8c86f709535e36fb8e9f571b53ca3d"

RPROVIDES:${PN} += "libdovi.so.3 \
libdovi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
