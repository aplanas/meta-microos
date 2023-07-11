SUMMARY = "OpenGL window and compositing manager community plugins"
DESCRIPTION = "This package contains the community unsupported Compiz compositing \
manager plugins. \
 \
This package contain development files required for developing \
other plugins."
LICENSE = "GPL-2.0-or-later & GPL-2.0-only"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-experimental-devel-0.8.18-1.17.aarch64.rpm"
RPM_HASH = "706246452a9b5602f57596f8e885fdb1eed02a52b00747f1abc053215379fe8f779f7cf88155b69417dcd94df4b0837e12c039e277124975ef342043eb38a866"

RPROVIDES:${PN} += "compiz-plugins-experimental-devel"

RDEPENDS:${PN} += "compiz-plugins-experimental \
pkgconfig-bcop \
pkgconfig-compiz \
pkgconfig-gl"

inherit rpm
