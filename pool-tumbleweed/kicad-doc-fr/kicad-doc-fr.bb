SUMMARY = "French documentation and tutorials for KiCad"
DESCRIPTION = "This package contains French documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-fr-7.0.5-1.1.noarch.rpm"
RPM_HASH = "166cafa7683d7b85be6ef3d0d5403af6698ce36771fc391c8ea79f57a7a10ec427d0447ab080880a25f8c2a8e0a88e71728a1f767f88ee4af860d4f2c10f07d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-fr \
locale(kicad-doc:fr)"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
