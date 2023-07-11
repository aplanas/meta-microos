SUMMARY = "Hardware Support"
DESCRIPTION = "Packages required to install openSUSE MicroOS on real hardware."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-hardware-5.0-72.1.aarch64.rpm"
RPM_HASH = "e9753e4c6703f4392f518606c31e4f62d28fe78b9aeb93bb7c9fa036d38173e3f531f01e078ac01a105476bb8d961deb745e240cab3b0635ba51fd1e9b764c23"

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
