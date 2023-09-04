SUMMARY = "Documentation and tutorials for KiCad"
DESCRIPTION = "Kicad is an open source software for the creation of electronic \
schematic diagrams and printed circuit board artwork. \
This is the documentation package for KiCad. It contains documentation \
and tutorials."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-7.0.6-1.1.noarch.rpm"
RPM_HASH = "fdb96668de5602e77c5bbed50d228ad3535b60e3db0285df64520a68a5f8661434c21c1c906556d60ccde20c36e3f604e2447ce88ef7f4315834b96d7d820e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc"

RDEPENDS:${PN} += ""

inherit rpm
