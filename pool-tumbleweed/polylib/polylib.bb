SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension."
LICENSE = "GPL-3.0-or-later"

PV = "5.22.5"

RPM_NAME = "polylib-5.22.5-2.1.aarch64.rpm"
RPM_HASH = "4c3a2060d18479428a0ca670d4b636f8751bb3db551a44ab971421895c759c47a81a677473ca75864d50bda4cca32704255d4e4a8af1e14eb88cd962ff3346dc"

RPROVIDES:${PN} += "polylib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libpolylibgmp.so.8"

inherit rpm
