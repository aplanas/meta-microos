SUMMARY = "English documentation and tutorials for KiCad"
DESCRIPTION = "This package contains English documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-en-7.0.5-1.1.noarch.rpm"
RPM_HASH = "e64dbe8de7d43f19ef86206bb95503de89df9e8f4e4a3e8e93dbb4b3712a606118e516e10faa29f3f0ff7d9239258a6a501094ed99d5e2098a008ea4ea97c5aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-en \
locale-kicad-doc-en"

RDEPENDS:${PN} += "kicad \
kicad-doc"

inherit rpm
