SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DIblBaker library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DIblBaker that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3diblbaker-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "1548d043e21eb5cd1b8795601082461cb0c16a2c594206135eb553ae0a87fa94f78bac1d4ddb5b9ba7f5e791cf97307684242d0c25d138510c377ba84fbdc93a"

RPROVIDES:${PN} += "qt6-quick3diblbaker-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DIblBaker \
qt6-gui-private-devel \
qt6-quick3druntimerender-private-devel"

inherit rpm
