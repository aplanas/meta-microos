SUMMARY = "M17N engine for fcitx"
DESCRIPTION = "M17N engine for fcitx. It allows input of many languages using the input table maps from m17n-db."
LICENSE = "GPL-2.0+"

PV = "0.2.4"

RPM_NAME = "fcitx-m17n-0.2.4-1.27.aarch64.rpm"
RPM_HASH = "e9522f7a8810fbdc19abfeb12c6d741f33c878d0cd87c3117670a16ef47361808f41bf9a196d904c747391b2fe2aeda0c68ed5765f686bf78cf196b9f20e604f"

RPROVIDES:${PN} += "fcitx-m17n"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libc.so.6 \
libm17n-core.so.0 \
libm17n.so.0"

inherit rpm
