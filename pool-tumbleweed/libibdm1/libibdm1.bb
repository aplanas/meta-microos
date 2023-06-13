SUMMARY = "Infiniband Data Model library"
DESCRIPTION = "This package contains shared libraries for the IB utils."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "libibdm1-1.5.7.0.2-11.8.aarch64.rpm"
RPM_HASH = "eaa5ac69e166daa96d7c73a9a1e8c687f1aedf4b5029ae5abe19ebed8a996576ea564d24b4c418081fb40f020a5da1cac75bb22e19033e27ef17b400486539e5"

RPROVIDES:${PN} += "libibdm.so.1()(64bit) \
libibdm1 \
libibdm1(aarch-64) \
libibdmcom.so.1()(64bit) \
libibis.so.1()(64bit) \
libibsysapi.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libopensm.so.9()(64bit) \
libosmcomp.so.5()(64bit) \
libosmvendor.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libtcl8.6.so()(64bit)"

inherit rpm
