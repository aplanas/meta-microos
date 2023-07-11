SUMMARY = "Documentation for texlive-elteikthesis"
DESCRIPTION = "This package includes the documentation for texlive-elteikthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn63186"

RPM_NAME = "texlive-elteikthesis-doc-2023.201.2.3svn63186-53.2.noarch.rpm"
RPM_HASH = "bb8a80a5316dd0a7f54890763f945b52d931d20d98c242d372a42e7c2e9d7499c2ec5112c9e1a343fbda9326966a27fab43cc134af43294791cac94d5d438de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-elteikthesis-doc-en;hu \
texlive-elteikthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
