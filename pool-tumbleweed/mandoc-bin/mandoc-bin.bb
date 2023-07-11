SUMMARY = "Format manual pages"
DESCRIPTION = "The mandoc utility formats manual pages for display. \
 \
It is split out from the mandoc package as it can be useful \
even without replacing the entire man infrastructure."
LICENSE = "ISC"

PV = "1.14.6"

RPM_NAME = "mandoc-bin-1.14.6-4.1.aarch64.rpm"
RPM_HASH = "09df427a8e5de8e56f345d7abc35ccf8ebb43f03fe290799d6cbcdf41846f08c14cb994903e6d9090a1b112740e44385822df3a0c655d4d8a38358698e527e23"

RPROVIDES:${PN} += "mandoc-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
