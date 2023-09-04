SUMMARY = "Documentation for texlive-embedall"
DESCRIPTION = "This package includes the documentation for texlive-embedall"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn51177"

RPM_NAME = "texlive-embedall-doc-2023.209.2.0svn51177-54.2.noarch.rpm"
RPM_HASH = "c2f33bae0455d92650abbbad61b0e3d929243e9196852a60c6836129e741fcc14fc0ec79f1604a1a4a0803076e629b21fc2cf37041037056f6fd11bcafe9cd0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedall-doc"

RDEPENDS:${PN} += ""

inherit rpm
