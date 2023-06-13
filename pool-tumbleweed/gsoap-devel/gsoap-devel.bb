SUMMARY = "Development files for the gSOAP toolkit"
DESCRIPTION = "This package contains the runtime development programs, include \
headers and development library symlinks for libgsoap."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.127"

RPM_NAME = "gsoap-devel-2.8.127-1.1.aarch64.rpm"
RPM_HASH = "bccd5d086a3cbfbea70bec10bc0557df04ae027840817415fcf77a37f7d398ea53a0c20868ad6e32c58dacc9cc802993c08757c45fddbe6c19928c4194e4c159"

RPROVIDES:${PN} += "gsoap-devel \
gsoap-devel(aarch-64) \
libgsoap-devel \
pkgconfig(gsoap) \
pkgconfig(gsoap++) \
pkgconfig(gsoapck) \
pkgconfig(gsoapck++) \
pkgconfig(gsoapssl) \
pkgconfig(gsoapssl++)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgsoapssl++-2.8.127.so()(64bit) \
libgsoapssl++-2.8.127.so(GSOAPSSLXX)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
