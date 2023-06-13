SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver"
DESCRIPTION = "Mixed Integer Linear Programming (MILP) solver lpsolve solves pure \
linear, (mixed) integer/binary, semi-continuous and special ordered \
sets (SOS) models."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "lpsolve-5.5.2.0-10.28.aarch64.rpm"
RPM_HASH = "dadc23f8db012aecd06b8f64007f541772f0aee3219259cc9f9c94a4201f26a95e8d2eb6b1517c35a81845be749e17e85788ebac7e9780add08d13a31935156a"

RPROVIDES:${PN} += "lpsolve \
lpsolve(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblpsolve55.so.0()(64bit)"

inherit rpm
