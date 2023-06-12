SUMMARY = "Data files for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides data/configuration files for libenchant."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-data-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "89884c53dc1233de9e1d8f609566d40170cea3553dcc0d66f6a9a379e8f16cd48af173a823bd7b0738f4f15cab091d739c81c742bf083141cc86cc950e8a09d4"

RPROVIDES:${PN} += "enchant-data enchant-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
