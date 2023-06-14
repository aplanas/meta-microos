SUMMARY = "Development files for the CM computation software"
DESCRIPTION = "The CM software implements the construction of ring class fields of \
imaginary quadratic number fields and of elliptic curves with complex \
multiplication via floating point approximations. \
 \
This subpackage provides the development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0+gb2b8d4bd"

RPM_NAME = "cm-devel-0.4.0+gb2b8d4bd-1.4.aarch64.rpm"
RPM_HASH = "fc7ea1f517932acb398944c01bb537734e8ba2f69209605f385ec9e6bcb59ef7cec7b1fc7c9fbcfa56e086d636341a2f54f70e6d443e1a75125483f414ca94a6"

RPROVIDES:${PN} += "cm-devel"

RDEPENDS:${PN} += "libcm0 \
mpc-devel \
mpfrcx-devel \
zlib-devel"

inherit rpm
