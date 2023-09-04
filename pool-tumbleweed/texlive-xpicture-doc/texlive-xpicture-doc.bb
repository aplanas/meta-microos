SUMMARY = "Documentation for texlive-xpicture"
DESCRIPTION = "This package includes the documentation for texlive-xpicture"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn28770"

RPM_NAME = "texlive-xpicture-doc-2023.209.1.2asvn28770-53.2.noarch.rpm"
RPM_HASH = "f0576a79098fddf79f81cf0f4dea4564fe76b7f1b39e0438546ae49dcfce3b3084d7252cc2079c859cbc2d717badc3f8955c7596d152cdddbbd02e5ab1c7551f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpicture-doc"

RDEPENDS:${PN} += ""

inherit rpm
