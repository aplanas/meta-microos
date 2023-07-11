SUMMARY = "Translations for package gnonograms"
DESCRIPTION = "Provides translations for the 'gnonograms' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "gnonograms-lang-2.0.0-1.8.noarch.rpm"
RPM_HASH = "c3e0ee2d619d9b736de390407125fbf8600dc0f627e7b11a7d3ac1936915a6741316e4306ef2055e2ee13734858a2c6d5662140eaaa40ed576377af0a5563216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnonograms-lang \
gnonograms-lang-all \
locale-gnonograms-fr \
locale-gnonograms-nl \
locale-gnonograms-pt"

RDEPENDS:${PN} += "gnonograms"

inherit rpm
