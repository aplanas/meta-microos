SUMMARY = "German documentation and tutorials for KiCad"
DESCRIPTION = "This package contains German documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-de-7.0.6-1.1.noarch.rpm"
RPM_HASH = "3af4715b56fd6478fd039bd17a9d9fbb73b761178ff989d0e018586788baa995f9242d03ed82dda6362c487e239b7bff3648cbd8ec8b4629ef29a8bf713e0636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-de \
locale-kicad-doc-de"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
