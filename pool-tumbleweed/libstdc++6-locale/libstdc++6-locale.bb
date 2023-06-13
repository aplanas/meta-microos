SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libstdc++6-locale-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "b1936e7006c3897c1bff420bb38a87887230078c17a4d9f94578bcd41a1365bce30e5692058fa004273b73ac890c669fcacf97b95276901147d34986e69ea8fe"

RPROVIDES:${PN} += "libstdc++6-locale \
libstdc++6-locale(aarch-64) \
locale(libstdc++6:de) \
locale(libstdc++6:fr)"

RDEPENDS:${PN} += ""

inherit rpm
