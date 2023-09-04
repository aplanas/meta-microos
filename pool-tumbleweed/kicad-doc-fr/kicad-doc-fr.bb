SUMMARY = "French documentation and tutorials for KiCad"
DESCRIPTION = "This package contains French documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-fr-7.0.6-1.1.noarch.rpm"
RPM_HASH = "e10f456f8ce8a95354fa829d7c79dd884fddf25f91aabe79da4582e22c0ec5cb67a83340ff9057c2ee20a0993b98709fa0ae4f383fa424d77f2fba3cff9d4bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-fr \
locale-kicad-doc-fr"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
