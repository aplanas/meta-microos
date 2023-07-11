SUMMARY = "External scripting package for Yate"
DESCRIPTION = "The yate-scripts package includes libraries for using external scripts with Yate."
LICENSE = "GPL-2.0-only"

PV = "6.4.0"

RPM_NAME = "yate-scripts-6.4.0-4.10.aarch64.rpm"
RPM_HASH = "ed61461477a7681411e297d0a20acdc9052c59bc2f9d2d6c7053925c65a410e1ce6a9e7436d7963ea5bb970b1c0fdfcc2f50b57f4d21b0efb28b0ec4f8140511"

RPROVIDES:${PN} += "perl-Yate \
yate-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/php \
/usr/bin/sh \
yate"

inherit rpm
