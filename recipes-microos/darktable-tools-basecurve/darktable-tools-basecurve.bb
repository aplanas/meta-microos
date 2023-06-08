SUMMARY = "The basecurve tool from tools/basecurve/"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the basecurve tool from tools/basecurve/. \
Another option to solve the same problem might be the darktable-chart module \
from the darktable package."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "darktable-tools-basecurve-4.2.1-1.3.aarch64.rpm"
RPM_HASH = "3a32c5d74f9c4755f4081dc22f7e4e89dd093bb5e5d57bd923d19e061c811468a9f01a98cf3cd8f0b837c61aaa82242ddb68e3fc75ba9eba74499fdbc7551afc"

RPROVIDES:${PN} += "darktable-tools-basecurve darktable-tools-basecurve(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/convert dcraw exiftool ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexiv2.so.27()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
