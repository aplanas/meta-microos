SUMMARY = "Mixed-level, Mixed-signal Circuit Simulator Based on spice3f5"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "ngspice-40-1.1.aarch64.rpm"
RPM_HASH = "eb10b4cc7f4e6bc11c47e6d4b819bf26dc3c90b739ae8bf359a00e283dfac65d019c5e6e7108e0c644e21c370d5aa8474e3c6f2524548378c5774bf60127d641"

RPROVIDES:${PN} += "ngspice \
ngspice(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXft.so.2()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
libfftw3.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
ngspice-scripts \
ngspice-xspice-cm"

inherit rpm
