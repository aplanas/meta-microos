SUMMARY = "A Beta-Quality Usermode Driver for the ECI ADSL USB Modem"
DESCRIPTION = "This package contains the driver for the ECI Hi-Focus ADSL USB modem. \
It also supports many USB ADSL modems based on the Globespan chipset. \
It is not a kernel module. It is a user-mode program that handles the \
modem. A kernel module is under development."
LICENSE = "GPL-2.0+"

PV = "0.11"

RPM_NAME = "eciadsl-usermode-0.11-154.29.aarch64.rpm"
RPM_HASH = "79c9163cadad4d1400c31081dab157b254b40024c46d7bdcc9771a2ad10264ffcd431ba764861008b8d4c90a5a4a24a812c140429c3b5c6b690eb5e12225c988"

RPROVIDES:${PN} += "config-eciadsl-usermode \
eciadsl-usermode"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
/usr/bin/wish \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
