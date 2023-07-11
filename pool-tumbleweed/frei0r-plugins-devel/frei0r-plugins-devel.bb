SUMMARY = "Frei0r plugin API for video sources and filters"
DESCRIPTION = "Frei0r is a minimalistic plugin API for video sources and filters. The \
behaviour of the effects can be controlled from the host by simple \
parameters. The intent is to solve the recurring reimplementation or \
adaptation issue of standard effects."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "frei0r-plugins-devel-1.8.0-2.5.aarch64.rpm"
RPM_HASH = "cd426dbd6f6be8f0e8765b02cafbc56b86a57109efefb5396740bc8171e7a5259e622c17fd11bac46695dd9fd7e9e25d117f37ca268c880fa5b1d86db3825fec"

RPROVIDES:${PN} += "frei0r-plugins-devel \
pkgconfig-frei0r"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
