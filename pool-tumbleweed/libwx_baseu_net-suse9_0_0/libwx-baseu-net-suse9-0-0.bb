SUMMARY = "wxWidgets networking library"
DESCRIPTION = "Classes for network access with wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu_net-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "9abc92f639bee309abb7cb30b4c48266573fc0d97b06469e2de5cdb06de9f601c13014204fcadd9631b32c31d2aa157116c8a88da8fd22d81d5107a7bcab3319"

RPROVIDES:${PN} += "libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-net-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0"

inherit rpm
