SUMMARY = "Shared lib for ldas-tools-al - LDAS tools abstraction toolkit"
DESCRIPTION = "This package provides the shared library for ldas-tools-al - LDAS tools abstraction toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.4"

RPM_NAME = "libldastoolsal7-2.6.4-1.13.aarch64.rpm"
RPM_HASH = "519cbb150710a026e3c623e2bb594c77679d6a08d1f96d5e4894f3ee93c0b6e9c12817a2a1d954f592d605ef553112d5b158820f4ffc8dd1d33cee11d8a287f2"

RPROVIDES:${PN} += "libldastoolsal.so.7()(64bit) \
libldastoolsal7 \
libldastoolsal7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
