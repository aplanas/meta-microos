SUMMARY = "Documentation for texlive-worksheet"
DESCRIPTION = "This package includes the documentation for texlive-worksheet"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48423"

RPM_NAME = "texlive-worksheet-doc-2023.209.1.1svn48423-54.1.noarch.rpm"
RPM_HASH = "4970aaf0697e88d95a96d56bb46220e8b7e053780ad9a8faff20260e444ac0bb64adac326974160a121dc21a5ef118fb8318b2a166d6af4a101ac819d1e915e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-worksheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
