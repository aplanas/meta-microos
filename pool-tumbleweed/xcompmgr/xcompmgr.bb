SUMMARY = "Compositing manager for X servers"
DESCRIPTION = "xcompmgr is a sample compositing manager for X servers supporting the \
XFIXES, DAMAGE, RENDER, and COMPOSITE extensions. It enables basic \
eye-candy effects."
LICENSE = "MIT"

PV = "1.1.9"

RPM_NAME = "xcompmgr-1.1.9-1.3.aarch64.rpm"
RPM_HASH = "ccf608055724d467e26e74163bd998270c2e86d46816bc6943f1d06f3fc2a99425e9100a34d49f1e6a4036e5afeb0ba0b8d364d15d8ef88d492032f592205f43"

RPROVIDES:${PN} += "xcompmgr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrender.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
