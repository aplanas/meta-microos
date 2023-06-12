SUMMARY = "Hardware Library"
DESCRIPTION = "A program that lists results from the hardware detection \
library."
LICENSE = "GPL-2.0-or-later"

PV = "22.2"

RPM_NAME = "hwinfo-22.2-1.3.aarch64.rpm"
RPM_HASH = "f93292603d3da5654f72695a0fb3abafef3a948b9383badd5f5977feac5c578f5b23859c5c205883f69a8be9122f27a3bd98cccca47eb4dd8e611a5ec0187d0e"

RPROVIDES:${PN} += "hwinfo \
hwinfo(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhd.so.22()(64bit)"

inherit rpm