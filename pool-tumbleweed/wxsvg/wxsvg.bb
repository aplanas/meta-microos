SUMMARY = "Library to create, manipulate and render SVG files"
DESCRIPTION = "WxSVG is a C++ library to create, manipulate and render SVG files."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "1.5.23"

RPM_NAME = "wxsvg-1.5.23-4.3.aarch64.rpm"
RPM_HASH = "d82b580ca58c1c3b074de3ff3ff0595ec27f1279cf93fffe9d5276c15917ce801fe5efb041969cc52e0e71c5c0d368598e1642533654621e3337982cd181cce3"

RPROVIDES:${PN} += "wxsvg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwxsvg.so.3"

inherit rpm
