SUMMARY = "English documentation and tutorials for KiCad"
DESCRIPTION = "This package contains English documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-en-7.0.6-1.1.noarch.rpm"
RPM_HASH = "8a152253139ea4488f3c1a19aa22424068737b2a480f22a5ba80edf7254b3688074ba6810d2faa1b79c07ea401fa6d6faf49408e0515eeef16aace0418db545c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-en \
locale-kicad-doc-en"

RDEPENDS:${PN} += "kicad \
kicad-doc"

inherit rpm
