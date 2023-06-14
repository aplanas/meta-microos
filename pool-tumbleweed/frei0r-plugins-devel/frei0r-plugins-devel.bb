SUMMARY = "Frei0r plugin API for video sources and filters"
DESCRIPTION = "Frei0r is a minimalistic plugin API for video sources and filters. The \
behaviour of the effects can be controlled from the host by simple \
parameters. The intent is to solve the recurring reimplementation or \
adaptation issue of standard effects."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "frei0r-plugins-devel-1.8.0-2.4.aarch64.rpm"
RPM_HASH = "ab1f0c35c97146be7daa6e617165dfb0d713b6c901f765844cd672d810f1ddb110fe83b3a5eb73516bd1b77fbd6a4c97bb05c4c05c93a7d2a146732c6f1a7a29"

RPROVIDES:${PN} += "frei0r-plugins-devel \
pkgconfig-frei0r"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
