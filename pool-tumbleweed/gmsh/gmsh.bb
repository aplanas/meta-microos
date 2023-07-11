SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "gmsh-4.11.1-2.2.aarch64.rpm"
RPM_HASH = "789b59a41ae455abee1949d760090bb67e974737846e56053eefe190674cda4e3adb3852309e53109a6d0f76e5767fd8fc02210f4065f036f4a5fe5aa887ed26"

RPROVIDES:${PN} += "gmsh"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
libc.so.6 \
libgmsh.so.4.11"

inherit rpm
