SUMMARY = "Tool to access image Exif metadata"
DESCRIPTION = "Exiv2 is a command line utility to access image metadata from tags like \
Exif."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "exiv2-0.28.0-2.1.aarch64.rpm"
RPM_HASH = "a95ef306ed89f56e553005f870bb2a0a46a1ed63a6acb01f8928c5cefb50baed8e735763aacdfb327bf73c2010cdf973f045c2481740bf07fd30bf0bfa512ea8"

RPROVIDES:${PN} += "exiv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
