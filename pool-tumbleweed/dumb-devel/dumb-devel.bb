SUMMARY = "Development libraries and headers for libdumb"
DESCRIPTION = "The development files that must be installed in order to compile \
applications which use libdumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "dumb-devel-2.0.3-1.9.aarch64.rpm"
RPM_HASH = "0a2c90232d5838771978bacf0ffbd78e6cfc936907429ed4d5ea09d5e8d935a01adf61fffa7335bc2d0ba8afacb277bbb6c940db6f6354d77277880f76eb814f"

RPROVIDES:${PN} += "dumb-devel \
dumb-devel(aarch-64) \
pkgconfig(dumb)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdumb2"

inherit rpm
