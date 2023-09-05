SUMMARY = "Development files for the gSOAP toolkit"
DESCRIPTION = "This package contains the runtime development programs, include \
headers and development library symlinks for libgsoap."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.130"

RPM_NAME = "gsoap-devel-2.8.130-1.1.aarch64.rpm"
RPM_HASH = "4d5062395cfffead33de32f1aace4fd72448969d5e0975438ff66138952965df1f046d89d06894072b31efeab7b164b3fa2756a2f99dd0bb98dac9c5e1bc5599"

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
libgsoapssl++-2.8.130.so \
libstdc++.so.6"

inherit rpm
