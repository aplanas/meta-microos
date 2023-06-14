SUMMARY = "Collection of Tools for Mastering Blu-ray and DVD+-RW/+-R Media"
DESCRIPTION = "The dvd+rw-tools collection of tools makes it possible to burn images to \
Blu-ray and DVD+-RW/+-R media."
LICENSE = "GPL-2.0-or-later"

PV = "7.1"

RPM_NAME = "dvd+rw-tools-7.1-62.16.aarch64.rpm"
RPM_HASH = "038e6b26a015bca3e896ece298b62eb18bb59e34633552a5c48b5d2761f8eac7b7277fc19588a23fa33a5e4f7a2a7b16878fde51c6b03fea339d16fafaffd3c5"

RPROVIDES:${PN} += "dvd+rw-tools"

RDEPENDS:${PN} += "/usr/bin/mkisofs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libisoburn1 \
libstdc++.so.6"

inherit rpm
