SUMMARY = "Library to create, manipulate and render SVG files"
DESCRIPTION = "WxSVG is a C++ library to create, manipulate and render SVG files."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "1.5.23"

RPM_NAME = "wxsvg-1.5.23-4.4.aarch64.rpm"
RPM_HASH = "76cce9c408d5477d407f672193103808526bc96ff5d3cbdbfdce57e9ba0fb47720970c74c819a4ac78098e4b9f724192fce8f0519f9227432c62ccce1fde5520"

RPROVIDES:${PN} += "wxsvg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwxsvg.so.3"

inherit rpm
