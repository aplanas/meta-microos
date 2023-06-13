SUMMARY = "Japanese documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Japanese documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-ja-7.0.5-1.1.noarch.rpm"
RPM_HASH = "873f7607b1bfa7c014eaac0d5257f843206f17e3cb6dd5db2d9b690bd7231ef40d6c6b302e077da31d28b724767d23e7282c4b9c6655f20ad23c802457d4a2a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ja \
locale(kicad-doc:ja)"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
