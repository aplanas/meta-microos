SUMMARY = "Hardware Support"
DESCRIPTION = "Packages required to install openSUSE MicroOS on real hardware."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-hardware-5.0-73.1.aarch64.rpm"
RPM_HASH = "aa513abc81635b20e505dbb64fcc82b92f9b157482a2fe118f6fad92627353c21a54d184f0df1ea1efd8701abda896005b5da7e584d85ed2b3115ebd4f4c62c4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-hardware"

RDEPENDS:${PN} += "ethtool \
fcoe-utils \
hwinfo \
irqbalance"

inherit rpm
