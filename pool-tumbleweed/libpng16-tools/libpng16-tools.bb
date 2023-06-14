SUMMARY = "Tools for Manipulating PNG Images"
DESCRIPTION = "Package consists of low level tools for manipulating and fixing particular \
PNG files."
LICENSE = "libpng-2.0"

PV = "1.6.39"

RPM_NAME = "libpng16-tools-1.6.39-4.1.aarch64.rpm"
RPM_HASH = "6a86c1ebe6f6e72d3db9c6aee7b3e49ce83bb30dccb43be959916b611d3786312f5f228bf0876a3a043a3735696174f2b5fe64d70ac6f7e219858125c86fddc1"

RPROVIDES:${PN} += "libpng-tools \
libpng16-tools \
rpm-macro-png-fix \
rpm-macro-png-fix-dir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
