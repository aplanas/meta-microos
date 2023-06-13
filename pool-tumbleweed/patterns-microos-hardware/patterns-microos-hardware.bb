SUMMARY = "Hardware Support"
DESCRIPTION = "Packages required to install openSUSE MicroOS on real hardware."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-hardware-5.0-70.1.aarch64.rpm"
RPM_HASH = "094dd76c4cf5889a01df47281f4922aaf3474106f27b3cb9063ce8919bffe0b9ab1254dfb891ade7559ebc9bf970d5a24b6df24910173cd9ee6b29bbcacf29fd"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-microos-hardware \
patterns-microos-hardware(aarch-64)"

RDEPENDS:${PN} += "ethtool \
fcoe-utils \
hwinfo \
irqbalance"

inherit rpm
