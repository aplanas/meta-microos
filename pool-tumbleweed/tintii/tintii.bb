SUMMARY = "Selective Colour Photo Filter"
DESCRIPTION = "tintii takes full colour photos and processes them into black and white \
with some select regions highlighted in colour. The technique is known \
as colour popping or selective colouring."
LICENSE = "GPL-2.0"

PV = "2.10.0"

RPM_NAME = "tintii-2.10.0-4.30.aarch64.rpm"
RPM_HASH = "76bf867c51abde1b14dfc3862934f10d5711845e56ca5bd938cc4f36890443acedbd22b57142ba8a095ab2b4d0601884ecd6fdce3ee6268e8ceabe5ba12ea692"

RPROVIDES:${PN} += "tintii"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-aui-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0"

inherit rpm
