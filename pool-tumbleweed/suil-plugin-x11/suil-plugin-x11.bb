SUMMARY = "Shared object for X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* X11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-x11-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "cd21392019d603f7218984a98417d46fed73f199db12d412f31c86bacee46a1719dcb6666e051524dd65b28f979a8e0c08cbe2821dd40cf1447bd2af60d1fb6a"

RPROVIDES:${PN} += "libsuil_x11.so()(64bit) \
suil-plugin-x11 \
suil-plugin-x11(aarch-64)"

RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libsuil-0-0"

inherit rpm
