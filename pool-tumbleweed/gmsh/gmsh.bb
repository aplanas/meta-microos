SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "gmsh-4.11.1-2.1.aarch64.rpm"
RPM_HASH = "7361b1e02e1983d5ca768114d031f80b9818a6f3e918c946ec7c8594a5ac45971b2f8444e9f4db8d275479e65f02a4b3dfd7d6d186495f1cd7ea93e4cf783d53"

RPROVIDES:${PN} += "gmsh \
gmsh(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
libc.so.6(GLIBC_2.34)(64bit) \
libgmsh.so.4.11()(64bit)"

inherit rpm
