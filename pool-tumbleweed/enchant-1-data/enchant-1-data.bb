SUMMARY = "Data files for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides data/configuration files for libenchant."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-data-1.6.1-6.4.aarch64.rpm"
RPM_HASH = "f5d01d54de6eb4c702484f6f00a628e18e141c12cfa641b8b2e94a5eee20aff27e249685912ea8049837e7b21e3e9070310e06558752c4f30e99833e63d2463a"

RPROVIDES:${PN} += "enchant-1-data \
enchant-data \
libenchant1-/usr/share/enchant/enchant.ordering"

RDEPENDS:${PN} += ""

inherit rpm
