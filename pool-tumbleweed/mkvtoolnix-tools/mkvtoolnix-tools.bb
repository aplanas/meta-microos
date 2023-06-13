SUMMARY = "Additional command line tools for mkv files"
DESCRIPTION = "This package contains extra command line tools for mkv diagnostic."
LICENSE = "GPL-2.0-or-later"

PV = "77.0"

RPM_NAME = "mkvtoolnix-tools-77.0-1.1.aarch64.rpm"
RPM_HASH = "a1a106b22d58177b34f8b018aa056554a7ff2174cac39c7abf9fb4230ec263c303adee88c9fa1e138261a014725b0cb4362455e823da19aabf6e97152804afa1"

RPROVIDES:${PN} += "mkvtoolnix-tools \
mkvtoolnix-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libebml.so.5()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libmatroska.so.7()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
