SUMMARY = "Development files for libini_config"
DESCRIPTION = "Library to process config files in INI format into a libcollection data \
structure"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "libini_config-devel-1.3.1-28.1.aarch64.rpm"
RPM_HASH = "5d8b48ff966e1ba4291448310f9d9e695f9252d151153097dade9ca6eaf829a38342e8fa274387992398e2dfff0c0365ed766693acbb50b026496922a0bbfa7d"

RPROVIDES:${PN} += "libini-config-devel \
pkgconfig-ini-config"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libini-config5 \
pkgconfig-basicobjects \
pkgconfig-collection \
pkgconfig-ref-array"

inherit rpm
