SUMMARY = "Non-linear curve fitting and data analysis"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "fityk-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "58c08aa444a9e483fe31eaf87fc1fdbc04fac67e0a037ddf40fa3ae50828bbe347e732273a41fd405b20dc1f6f756b10cf3a49fd50a1f84f6f4f7e5725ad5ece"

RPROVIDES:${PN} += "fityk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfityk.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libnlopt.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-stc-suse.so.9.0.0 \
libxy.so.3"

inherit rpm
