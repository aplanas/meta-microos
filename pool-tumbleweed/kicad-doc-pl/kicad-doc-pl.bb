SUMMARY = "Polish documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Polish documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-pl-7.0.5-1.1.noarch.rpm"
RPM_HASH = "913179b69947e6eeda68cf87f9a705d74daca86353c0a2531e1d0c50ddcb72ac691aac989ccba302f33b93e4909f5482fe8d0036783a812da5302bacd8f30ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-pl \
locale(kicad-doc:pl)"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
