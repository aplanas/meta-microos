SUMMARY = "Documentation for texlive-ltxtools"
DESCRIPTION = "This package includes the documentation for texlive-ltxtools"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1asvn24897"

RPM_NAME = "texlive-ltxtools-doc-2023.201.0.0.0.1asvn24897-52.1.noarch.rpm"
RPM_HASH = "86c6f48fed678ee2afc56ba102f5375a83875adb49f1732a86824b6087524178ea4f014bd12eeb2e2f0b28f1d0b945f592737fcda772158bbd66c362326e0809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxtools-doc"
RDEPENDS:${PN} += ""

inherit rpm
