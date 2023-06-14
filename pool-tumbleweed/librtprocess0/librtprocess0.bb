SUMMARY = "Shared library for librtprocess"
DESCRIPTION = "This is a project that aims to make some of RawTherapee's highly optimized raw \
processing routines readily available for other FOSS photo editing software. \
 \
This package holds the shared library."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "0.12.0+20211228"

RPM_NAME = "librtprocess0-0.12.0+20211228-1.6.aarch64.rpm"
RPM_HASH = "c0c400fbe779276091dd227bc6004a3cfc6017bf85c0c1b03940e98330168a7878fbcc969ab929328f631df766714251772fbafd806c358966d126ec9f912d9b"

RPROVIDES:${PN} += "librtprocess.so.0 \
librtprocess0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
