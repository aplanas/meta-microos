SUMMARY = "FDTD finite-difference time-domain solver"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "meep-1.26.0-1.4.aarch64.rpm"
RPM_HASH = "f27e5aa76dc728a1d1b012c771f88489481a1dd7b8b750a53d940ffbde8422051b43a7ee726657fc3b8b8574dca61bb38c6835466d1a83fdff8a5d37cc7b9296"

RPROVIDES:${PN} += "meep"

RDEPENDS:${PN} += "guile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctl-devel \
libctl.so.7 \
libgcc-s.so.1 \
libguile-3.0.so.1 \
libm.so.6 \
libmeep.so.31 \
libstdc++.so.6"

inherit rpm
