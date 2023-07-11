SUMMARY = "Electromagnetic field solver using the EC-FDTD method"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "openEMS-0.0.35-5.37.aarch64.rpm"
RPM_HASH = "1dfdcfd0f5011f0acf17fd309c5d5833d7342efbf82fb22fc7356abe063315d55362e7de1c140305a65cf17fd001232ffeae266b73c20d2207ee89a7ac057e08"

RPROVIDES:${PN} += "openEMS"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnf2ff.so.0 \
libopenEMS.so.0 \
libstdc++.so.6"

inherit rpm
