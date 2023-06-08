SUMMARY = "Development package for dtkwm"
DESCRIPTION = "Header files and libraries for dtkwm."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.12"

RPM_NAME = "dtkwm-devel-2.0.12-2.10.aarch64.rpm"
RPM_HASH = "121aec63025e207785f48c5ef9bbf2b70bafab0ca960018d0641923ff1526e42faf3378fa9776469cd3342c4c44214a983e708e4e0aa7b562bfba39d8069fbf1"

RPROVIDES:${PN} += "cmake(DtkWm) dtkwm-devel dtkwm-devel(aarch-64) pkgconfig(dtkwm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdtkwm5 pkgconfig(dtkcore)"

inherit rpm
