SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-allwinner-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "83063683e3548a97964e32db14ffcb53082733dd21362436fc32f0b0eacd32678e3bfffb947e750f54140363509005e060a57239b9892a7d33bdc609c67bdbdd"

RPROVIDES:${PN} += "dtb-allwinner \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
