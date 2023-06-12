SUMMARY = "Indonesian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Indonesian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-id-7.0.5-1.1.noarch.rpm"
RPM_HASH = "d4b8379bbe1a63adcb9051d264ebf40c2d0a5df02213a7ce07e6a400be8f074066b4c24ea1b82705a3489fb4a93fd0fb11b742ac25a06912bd16662991c6a002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-id \
locale(kicad-doc:id)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
