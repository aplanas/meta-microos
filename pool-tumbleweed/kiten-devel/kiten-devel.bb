SUMMARY = "Development files for kiten"
DESCRIPTION = "Kiten is a tool to learn Japanese. \
 \
This package contains files for developing applications using kiten."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kiten-devel-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "b0161cff1b0300e724a250277fe02cdd733af4f530ea24cb4fb5493075aacf5f0e0785de03c85fae0c0141ba0344f047959252c83eaedea8b3f3bbd0d1761129"

RPROVIDES:${PN} += "kiten-devel"

RDEPENDS:${PN} += "kiten"

inherit rpm
