SUMMARY = "Library for parsing the AbiWord file format structure"
DESCRIPTION = "Libabw is library providing ability to interpret and import AbiWord documents \
into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-0_1-1-0.1.3-1.18.aarch64.rpm"
RPM_HASH = "638d6402ce134259c59cff72ad1955aa0b60bc86ef3223982d04f9c09ed2ae9ed51c9db5a72c93c193d9ec481318fef2f4049a1d7cd4bb7a44af47d95dba7329"

RPROVIDES:${PN} += "libabw-0-1-1 \
libabw-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
