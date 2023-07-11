SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "An implementation of the IDNA2008 specifications (RFCs 5890, 5891, 5892, 5893)"
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "2.3.4"

RPM_NAME = "libidn2-devel-2.3.4-1.4.aarch64.rpm"
RPM_HASH = "363f65b002f92afb69829d3e080ebedce1b4776741af2b7463e8ba2a29cabead13a9e7bc30ebc100f11e6227487580edbadc49313cfeae8231e281bbfca9d2b5"

RPROVIDES:${PN} += "libidn2-devel \
pkgconfig-libidn2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libidn2-0"

inherit rpm
