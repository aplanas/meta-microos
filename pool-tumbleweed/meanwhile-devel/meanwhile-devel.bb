SUMMARY = "IBM Sametime Community Client library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "meanwhile-devel-1.1.1-1.17.aarch64.rpm"
RPM_HASH = "53fffc8fe081d6f0f19aea6b81e931fde97f90fcbe04c9cb3d344b39af19d3ab2a22fd6f661abd538e0040dcb549b281b86199e069f37ff0eef6728f7fa577e9"

RPROVIDES:${PN} += "meanwhile-devel \
pkgconfig-meanwhile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmeanwhile1 \
pkgconfig-glib-2.0"

inherit rpm
