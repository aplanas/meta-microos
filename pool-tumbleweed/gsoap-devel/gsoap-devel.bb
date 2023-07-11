SUMMARY = "Development files for the gSOAP toolkit"
DESCRIPTION = "This package contains the runtime development programs, include \
headers and development library symlinks for libgsoap."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.127"

RPM_NAME = "gsoap-devel-2.8.127-1.2.aarch64.rpm"
RPM_HASH = "9b43c706319f0203b6e60555b53be9a15854b71e2b26b666e43cc091813caadd1e5ce4c1e8c5e343411924780a0e56af8565fe404570980815003383720af3fc"

RPROVIDES:${PN} += "gsoap-devel \
libgsoap-devel \
pkgconfig-gsoap \
pkgconfig-gsoap++ \
pkgconfig-gsoapck \
pkgconfig-gsoapck++ \
pkgconfig-gsoapssl \
pkgconfig-gsoapssl++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgsoapssl++-2.8.127.so \
libstdc++.so.6"

inherit rpm
