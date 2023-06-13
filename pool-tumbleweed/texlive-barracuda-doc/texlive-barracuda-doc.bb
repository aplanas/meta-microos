SUMMARY = "Documentation for texlive-barracuda"
DESCRIPTION = "This package includes the documentation for texlive-barracuda"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.0.12svn63708"

RPM_NAME = "texlive-barracuda-doc-2023.201.0.0.0.12svn63708-53.1.noarch.rpm"
RPM_HASH = "70ae51f21dd85c34f885f9a5c833b61311ede1433eb9669c4fa5852ab41d780ea1c2ec13f9188248f5220d3d1ced633c8f28c68b3ea19e78f01323d5a273c07f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barracuda-doc"

RDEPENDS:${PN} += ""

inherit rpm
