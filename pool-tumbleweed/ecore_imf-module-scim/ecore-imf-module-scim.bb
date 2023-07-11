SUMMARY = "SCIM module for Ecore"
DESCRIPTION = "SCIM input method module for Ecore."
LICENSE = "BSD-2-Clause"

PV = "1.26.3"

RPM_NAME = "ecore_imf-module-scim-1.26.3-30.8.aarch64.rpm"
RPM_HASH = "513f4876e5bb9185f30b85aab9523afb3d452eed37542bece9a39e5c7d2c15836704cf38d49d9a694cea774bcb82cfecbfc3cb055907614bd7437d376c67d10a"

RPROVIDES:${PN} += "ecore-imf-module-scim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libecore-evas.so.1 \
libecore-imf.so.1 \
libecore-x.so.1 \
libecore.so.1 \
libeina.so.1 \
libevas.so.1 \
libgcc-s.so.1 \
libscim-1.0.so.8 \
libstdc++.so.6"

inherit rpm
