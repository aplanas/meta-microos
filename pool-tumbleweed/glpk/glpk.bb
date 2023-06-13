SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-5.0-1.13.aarch64.rpm"
RPM_HASH = "6728387ec488107de22f0694c56116a657fd67a0991817ec1a2090f8d6e0527448a3167c9562d8275d8063906fb530e5f7f0eb58ae39c5484d7ebd5d7096bc9d"

RPROVIDES:${PN} += "glpk \
glpk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglpk.so.40()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
