SUMMARY = "Library containing a rich set of graph drawing tools"
DESCRIPTION = "The lab_gamut library contains a rich set of graph drawing tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "liblab_gamut1-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "a44267aa9df1bc2a7bba273322ad5b26c9dc30ba94f36b4f23dd78643cfaf7538be8bfbd5abeedbfeb6a2a0420381d509a4919079df8cb1a982c51bdd05e46db"

RPROVIDES:${PN} += "libgraphviz6-/usr/lib64/liblab-gamut.so.1 \
liblab-gamut.so.1 \
liblab-gamut1"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
