SUMMARY = "A Beta-Quality Usermode Driver for the ECI ADSL USB Modem"
DESCRIPTION = "This package contains the driver for the ECI Hi-Focus ADSL USB modem. \
It also supports many USB ADSL modems based on the Globespan chipset. \
It is not a kernel module. It is a user-mode program that handles the \
modem. A kernel module is under development."
LICENSE = "GPL-2.0+"

PV = "0.11"

RPM_NAME = "eciadsl-usermode-0.11-154.28.aarch64.rpm"
RPM_HASH = "5cd5e330c8ed1a9199d5e6a00bfdd401b614dbfb2a17ccc3a41c9e3a276c2b9b68449319912d1f486694b20ca07c76299b0d52ecba99a3f428b1a7607e4fed56"

RPROVIDES:${PN} += "config(eciadsl-usermode) \
eciadsl-usermode \
eciadsl-usermode(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/wish \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
