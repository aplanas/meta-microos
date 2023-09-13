SUMMARY = "Header files for ALSA topology development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require ALSA topology."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.10"

RPM_NAME = "alsa-topology-devel-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "3cf4b220617f9002c164564fa18e84642c04a5bf05ddcea7effa639c7f9dddd20ee12bf4b4d04f72a7791b1ca9dce2a9947d0af1ee89c19370fa04587276ea3e"

RPROVIDES:${PN} += "alsa-topology-devel \
pkgconfig-alsa-topology"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
libatopology2 \
pkgconfig-alsa"

inherit rpm
