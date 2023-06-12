SUMMARY = "Documentation for texlive-exam-randomizechoices"
DESCRIPTION = "This package includes the documentation for texlive-exam-randomizechoices"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn61719"

RPM_NAME = "texlive-exam-randomizechoices-doc-2023.201.0.0.2svn61719-52.1.noarch.rpm"
RPM_HASH = "105b3dbe03576d6d018369da565885cc5950f505d00443042b5f5ddb2184a49768d8a50d1c319e4757e152009aeecab39507dbd18bb2904e3ca553591d3944f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-randomizechoices-doc"
RDEPENDS:${PN} += ""

inherit rpm
