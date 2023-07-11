SUMMARY = "Library for parsing the AbiWord file format structure"
DESCRIPTION = "Libabw is library providing ability to interpret and import AbiWord documents \
into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-0_1-1-0.1.3-1.19.aarch64.rpm"
RPM_HASH = "90ed45954dc7d631bf5e888eb73f198ddd08405cb67b722f248726d0dfb6c8e8d4983a9567aa7dd6d541d10c39a44480035a6f59a01f6912fca8280190c5035c"

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
