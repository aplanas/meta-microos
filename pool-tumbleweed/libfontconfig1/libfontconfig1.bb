SUMMARY = "Library for font configuration"
DESCRIPTION = "Fontconfig is a library for configuring and customizing font access. It \
contains two essential modules: the configuration module, which builds \
an internal configuration from XML files, and the matching module, \
which accepts font patterns and returns the nearest matching font."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "libfontconfig1-2.14.2-1.3.aarch64.rpm"
RPM_HASH = "d6a0cef4dee5ad9494bd7d3926b5f4232bd5b492fda808ef1cd13ce0e40d50eb436152c5b731dca0c831e9fac16cc6222201c81be924ed660d8e0908f507ad22"

RPROVIDES:${PN} += "libfontconfig.so.1 \
libfontconfig1"

RDEPENDS:${PN} += "/sbin/ldconfig \
fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libfreetype.so.6"

inherit rpm
