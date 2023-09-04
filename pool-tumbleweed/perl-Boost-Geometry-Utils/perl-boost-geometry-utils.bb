SUMMARY = "Bindings for the Boost Geometry library"
DESCRIPTION = "Bindings for the Boost Geometry library"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Boost-Geometry-Utils-0.15-4.39.aarch64.rpm"
RPM_HASH = "92312a1f4e023c0eefb76bad6e6574f8e959300058cf16afc3adaeae3ee19af61df29304a2600c500a68c6a04e82a9a2dfd30fb92ac61391e8ef3d041fcb1224"

RPROVIDES:${PN} += "perl-Boost--Geometry--Utils \
perl-Boost-Geometry-Utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
