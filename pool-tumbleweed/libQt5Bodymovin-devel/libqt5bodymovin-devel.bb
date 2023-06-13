SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with the Qt BodyMovin \
library."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5Bodymovin-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "1ed46aa52c6df37652867a46e44ef0278deadb1aa18d8cb81c959754410e51c38c0fee2219275a8ee3638ca3c23500d934df904c7b686094a7fe1c60d45ad35f"

RPROVIDES:${PN} += "cmake(Qt5Bodymovin) \
libQt5Bodymovin-devel \
libQt5Bodymovin-devel(aarch-64)"

RDEPENDS:${PN} += "libQt5Bodymovin5"

inherit rpm
