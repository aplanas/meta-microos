SUMMARY = "Shared lib for ldas-tools-al - LDAS tools abstraction toolkit"
DESCRIPTION = "This package provides the shared library for ldas-tools-al - LDAS tools abstraction toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.4"

RPM_NAME = "libldastoolsal7-2.6.4-1.14.aarch64.rpm"
RPM_HASH = "d19226bf887e4b7b5e2bb6c80952a6e5114d05bfb68c75111f138801ab643cdfd9682518be7a3031faf13d8c4fe48f7e13a7a5f1fb903962e74cd9cfcd65d548"

RPROVIDES:${PN} += "libldastoolsal.so.7 \
libldastoolsal7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
