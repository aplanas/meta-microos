SUMMARY = "Documentation for texlive-classics"
DESCRIPTION = "This package includes the documentation for texlive-classics"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn53671"

RPM_NAME = "texlive-classics-doc-2023.209.0.0.1asvn53671-54.1.noarch.rpm"
RPM_HASH = "116605e283ea59af4445f0d85995eda4cf4d593d54819a8bd2b70848232b91743db5dbe1d41147f3d0684d56c3ea6a22b2978ff1a5dc58d80d8f2860255758d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classics-doc"

RDEPENDS:${PN} += ""

inherit rpm
