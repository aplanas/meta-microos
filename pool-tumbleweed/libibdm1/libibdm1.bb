SUMMARY = "Infiniband Data Model library"
DESCRIPTION = "This package contains shared libraries for the IB utils."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "libibdm1-1.5.7.0.2-11.8.aarch64.rpm"
RPM_HASH = "eaa5ac69e166daa96d7c73a9a1e8c687f1aedf4b5029ae5abe19ebed8a996576ea564d24b4c418081fb40f020a5da1cac75bb22e19033e27ef17b400486539e5"

RPROVIDES:${PN} += "libibdm.so.1 \
libibdm1 \
libibdmcom.so.1 \
libibis.so.1 \
libibsysapi.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopensm.so.9 \
libosmcomp.so.5 \
libosmvendor.so.5 \
libstdc++.so.6 \
libtcl8.6.so"

inherit rpm
