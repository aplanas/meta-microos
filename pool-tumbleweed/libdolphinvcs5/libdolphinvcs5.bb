SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libdolphinvcs5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b9689c3ed5b1d18a87af55a138015a0f2041270ec3e68365bd483f0cd81dd416618f3f1d40825362d79aaff470c4d3be74beba3722812759a3494789c42c139f"

RPROVIDES:${PN} += "libdolphinvcs.so.5 \
libdolphinvcs5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
