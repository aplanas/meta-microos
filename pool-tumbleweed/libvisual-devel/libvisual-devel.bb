SUMMARY = "Headers for the libvisual sound visualization library"
DESCRIPTION = "Libvisual is a library that acts as a middle layer between applications \
that want audio visualisation and audio visualisation plugins. \
 \
This library is used by amaroK for example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libvisual-devel-0.4.0-204.4.aarch64.rpm"
RPM_HASH = "1ad155140fb07883a9fa68917afe5275dc6cdba47675e8a7e662eb98cd5e8e1982c0577858bd05b7783c67fb5604a36c1f32a7a4cbf19a5d610599d8c351e5d1"

RPROVIDES:${PN} += "libvisual-devel \
pkgconfig-libvisual-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libvisual-0-4-0"

inherit rpm
