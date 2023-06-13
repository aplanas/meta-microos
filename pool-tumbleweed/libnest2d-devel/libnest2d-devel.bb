SUMMARY = "Library for the 2D bin packaging problem"
DESCRIPTION = "A library and framework for the 2D bin packaging problem."
LICENSE = "LGPL-3.0-only"

PV = "0.4+git.20201105"

RPM_NAME = "libnest2d-devel-0.4+git.20201105-1.8.aarch64.rpm"
RPM_HASH = "b3321f38e5d37e2cedcb52151e2c68075195fe5089ad638b9b958444955f0eac79f47a89d60c485043e6f2d203b51e4a2585c027ecfc146c590ee27b5b4d5177"

RPROVIDES:${PN} += "cmake(Libnest2D) \
libnest2d-devel \
libnest2d-devel(aarch-64)"

RDEPENDS:${PN} += "libboost_headers-devel \
libpolyclipping-devel \
pkgconfig(nlopt)"

inherit rpm
