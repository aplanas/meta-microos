SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-devel-5.0-1.13.aarch64.rpm"
RPM_HASH = "1fcd694e6f6bb4f218411e44c4bc5b21f6bf3ee3738958c50268d5872251686ebdad0766b6303bbcc54c0a817e15f8c8c4ac09ef121be6686ff3a578233c45ab"

RPROVIDES:${PN} += "glpk-devel \
glpk-devel(aarch-64) \
pkgconfig(glpk)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglpk40"

inherit rpm
