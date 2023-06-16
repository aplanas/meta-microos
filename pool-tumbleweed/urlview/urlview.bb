SUMMARY = "An URL extractor/viewer"
DESCRIPTION = "urlview presents a menu of all URLs from a given text file (e.g., a \
mail). The user may then view the information located on those URLs."
LICENSE = "GPL-2.0+"

PV = "0.9"

RPM_NAME = "urlview-0.9-733.2.aarch64.rpm"
RPM_HASH = "21124e304f4469f9ad1e23f30c1e18ad9ba7b2385939511809224f895d6043d4624f477e355ce08c9406a153d62f05511d0f89bb5bdc1853d8d43df1ca053c02"

RPROVIDES:${PN} += "config-urlview \
urlview"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
