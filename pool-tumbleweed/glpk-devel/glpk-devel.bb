SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-devel-5.0-1.14.aarch64.rpm"
RPM_HASH = "e3fda91e3dd19f15c1583587e9d59672404a59333175fdbccc4104837ac39258f79149f0afa2ad1e8298f0c64b66ef1ff00f0db45565fa6af0e1eff43ed1fbd4"

RPROVIDES:${PN} += "glpk-devel \
pkgconfig-glpk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglpk40"

inherit rpm
