SUMMARY = "Selective Colour Photo Filter"
DESCRIPTION = "tintii takes full colour photos and processes them into black and white \
with some select regions highlighted in colour. The technique is known \
as colour popping or selective colouring."
LICENSE = "GPL-2.0"

PV = "2.10.0"

RPM_NAME = "tintii-2.10.0-4.30.aarch64.rpm"
RPM_HASH = "76bf867c51abde1b14dfc3862934f10d5711845e56ca5bd938cc4f36890443acedbd22b57142ba8a095ab2b4d0601884ecd6fdce3ee6268e8ceabe5ba12ea692"

RPROVIDES:${PN} += "application() \
application(tintii.desktop) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/x-bmp) \
mimehandler(image/x-pcx) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-targa) \
mimehandler(image/x-xpm) \
tintii \
tintii(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk2u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_html-suse.so.9.0.0()(64bit)"

inherit rpm
