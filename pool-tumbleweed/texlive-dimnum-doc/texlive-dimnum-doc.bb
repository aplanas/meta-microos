SUMMARY = "Documentation for texlive-dimnum"
DESCRIPTION = "This package includes the documentation for texlive-dimnum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn58774"

RPM_NAME = "texlive-dimnum-doc-2023.209.1.0.1svn58774-53.1.noarch.rpm"
RPM_HASH = "0478e798b080115b37b55e3890c5ea1d59fbab254d5c6ac9d2e70f81d2b46117607597613357c80bce31292503fe15b9353dab37462db74cf09d55244f5908c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dimnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
