SUMMARY = "Catalan documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Catalan documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-ca-7.0.5-1.1.noarch.rpm"
RPM_HASH = "f63fe7b3690bc449101a72f57a4a434fb3915f0226cb25d0514b9b60266338028fbc39e5c3be9fb4b55e04a2b1c1a8311ba0baa03ca67be3689897bcf0aca65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ca \
locale-kicad-doc-ca"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
