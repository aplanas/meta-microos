SUMMARY = "Header files for C OpenGL Mathematics"
DESCRIPTION = "This package contains development files for cglm."
LICENSE = "MIT"

PV = "0.8.9"

RPM_NAME = "cglm-devel-0.8.9-1.4.aarch64.rpm"
RPM_HASH = "862765b18362fef77efab8584a1d48aa73ef30e61f6a2a96339fb9a0a6f2458f77dbe10d3294322f5dd1c3e0b7ce7c13f95b329457f6ca2cde1c1520cfce48e9"

RPROVIDES:${PN} += "cglm-devel \
pkgconfig-cglm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcglm0"

inherit rpm
