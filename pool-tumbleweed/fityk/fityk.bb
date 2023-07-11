SUMMARY = "Non-linear curve fitting and data analysis"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "fityk-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "5422addcaf309dacf43d0588fbc52da59408bafb524af46a1ea98cc0effd15bd8c5e7cde057a26cde9636f6ecfe204158f8dace5d207605c7bb476cb42fd50aa"

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
