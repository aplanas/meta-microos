SUMMARY = "Calculation of Gröbner fans"
DESCRIPTION = "Gfan is a software package for computing Gröbner fans and tropical \
varieties. These are polyhedral fans associated to polynomial ideals."
LICENSE = "GPL-2.0-only"

PV = "0.6.2"

RPM_NAME = "gfan-0.6.2-4.12.aarch64.rpm"
RPM_HASH = "b11a9014d07e09e6de05869e1d73fc7544ff480af3d05c22e26f57493a1f525027d3b65e9beac539957a2d3f05fda93f9c325e5633ba3383b95c8945219d8e5f"

RPROVIDES:${PN} += "gfan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcddgmp.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
