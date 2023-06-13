SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "libglpk40-5.0-1.13.aarch64.rpm"
RPM_HASH = "a0e527bda64280eab4fa346bfae69839ce0f65f925f147c0e1783fd97097ed2c051c638e504a5ffc26c497f81f7a7e2f871a1a039f8fd9799116e5f45f3cfd83"

RPROVIDES:${PN} += "libglpk.so.40()(64bit) \
libglpk40 \
libglpk40(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libltdl.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
