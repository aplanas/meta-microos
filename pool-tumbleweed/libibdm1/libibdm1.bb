SUMMARY = "Infiniband Data Model library"
DESCRIPTION = "This package contains shared libraries for the IB utils."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "libibdm1-1.5.7.0.2-11.9.aarch64.rpm"
RPM_HASH = "3bb46fb6af3973a67cb465c0599f66037936951b6613771ef785f497423aef032b0c16b389ccfacefca806fae2f4be13dc0126a014ce48dc1cb08ee46e54932b"

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
