SUMMARY = "FDTD finite-difference time-domain solver"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "meep-1.26.0-1.3.aarch64.rpm"
RPM_HASH = "953bfd6181246c06a886a78901abe48ef5dcf47308687da9768e160615b148927b625eca309f26145e528a8ba1606eb253dedd51a8e2fec735069399574a0d91"

RPROVIDES:${PN} += "meep \
meep(aarch-64)"

RDEPENDS:${PN} += "guile \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libctl-devel \
libctl.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libguile-3.0.so.1()(64bit) \
libm.so.6()(64bit) \
libmeep.so.31()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
