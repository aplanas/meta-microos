SUMMARY = "Development files for libpath_utils"
DESCRIPTION = "Utility functions to manipulate filesystem pathnames"
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "libpath_utils-devel-0.2.1-28.1.aarch64.rpm"
RPM_HASH = "41308ac276e6364487e7aaedc590424a01b24e3ed6f12449e53cc8737300e9f74703b3063ee0a40ecfa4e288f9461c49860cccc084027a03f665e225b0d59ec5"

RPROVIDES:${PN} += "libpath-utils-devel \
pkgconfig-path-utils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpath-utils1"

inherit rpm
