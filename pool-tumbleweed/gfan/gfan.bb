SUMMARY = "Calculation of Gröbner fans"
DESCRIPTION = "Gfan is a software package for computing Gröbner fans and tropical \
varieties. These are polyhedral fans associated to polynomial ideals."
LICENSE = "GPL-2.0-only"

PV = "0.6.2"

RPM_NAME = "gfan-0.6.2-4.12.aarch64.rpm"
RPM_HASH = "b11a9014d07e09e6de05869e1d73fc7544ff480af3d05c22e26f57493a1f525027d3b65e9beac539957a2d3f05fda93f9c325e5633ba3383b95c8945219d8e5f"

RPROVIDES:${PN} += "gfan \
gfan(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcddgmp.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
