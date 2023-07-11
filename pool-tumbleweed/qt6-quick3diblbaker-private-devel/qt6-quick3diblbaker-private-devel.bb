SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DIblBaker library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DIblBaker that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3diblbaker-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "799874d92e0ac86f3a0281f675ea5c3916f81838bc08a9349e03c02c05e694ad8ce0c145256a39bf22c9e8a5900e7c9179476b97183f874bd534b68539350e51"

RPROVIDES:${PN} += "qt6-quick3diblbaker-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DIblBaker"

inherit rpm
