SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension."
LICENSE = "GPL-3.0-or-later"

PV = "5.22.5"

RPM_NAME = "libpolylibgmp8-5.22.5-2.1.aarch64.rpm"
RPM_HASH = "6158d0a31393337035d3bd2e30ae858e9f9e186f1288ea64ff64be4ae2217226b8d4b90bd7830d5b6fffabdec7723dc4ffd5be8412a3973159b3ecd5511dc17b"

RPROVIDES:${PN} += "libpolylibgmp.so.8 \
libpolylibgmp8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
