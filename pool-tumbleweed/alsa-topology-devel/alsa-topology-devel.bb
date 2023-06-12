SUMMARY = "Header files for ALSA topology development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require ALSA topology."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.9"

RPM_NAME = "alsa-topology-devel-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "7e0f26ddb3d2222d5bf051893e0530c850501dba0be15bdc9288305432f35ab147c43a975791df4bc7b2de89b9e9b186d82ae929f0e1e9aa58e4cc7d82f85022"

RPROVIDES:${PN} += "alsa-topology-devel \
alsa-topology-devel(aarch-64) \
pkgconfig(alsa-topology)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
libatopology2 \
pkgconfig(alsa)"

inherit rpm
