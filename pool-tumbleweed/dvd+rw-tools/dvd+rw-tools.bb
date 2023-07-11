SUMMARY = "Collection of Tools for Mastering Blu-ray and DVD+-RW/+-R Media"
DESCRIPTION = "The dvd+rw-tools collection of tools makes it possible to burn images to \
Blu-ray and DVD+-RW/+-R media."
LICENSE = "GPL-2.0-or-later"

PV = "7.1"

RPM_NAME = "dvd+rw-tools-7.1-62.17.aarch64.rpm"
RPM_HASH = "9ba349070f3a4f9d971bab5e691c0eb4c9efd3fe91df9da6beaeb56930c4b5523270d234c51cac90f27bc3e6a46155f384f99171d1bfbcf374ae061f7f3f687e"

RPROVIDES:${PN} += "dvd+rw-tools"

RDEPENDS:${PN} += "/usr/bin/mkisofs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libisoburn1 \
libstdc++.so.6"

inherit rpm
