SUMMARY = "Development files for libwget"
DESCRIPTION = "libwget which provides an interface to many useful functions used by \
Wget2. \
 \
This subpackage contains the header files for application wanting \
to build against libwget."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "libwget-devel-2.0.1-1.5.aarch64.rpm"
RPM_HASH = "6c713204a133f53de64a6a1c68bab0172384ea8d5f6fe7b4f857c4c39c5eb5d857a17ab648001f59ada83beb8e01c7b15eec186d8f8067fb02ec7fa10496c376"

RPROVIDES:${PN} += "libwget-devel \
libwget-devel(aarch-64) \
pkgconfig(libwget)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
