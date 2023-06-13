SUMMARY = "Documentation for texlive-etbb"
DESCRIPTION = "This package includes the documentation for texlive-etbb"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.056svn61872"

RPM_NAME = "texlive-etbb-doc-2023.201.1.056svn61872-52.1.noarch.rpm"
RPM_HASH = "8176371b1d40c891d55c0122b0f891a88862d7dc50267544280c6212003dd08ba00ae8f1ceb8099d553fec6e0e4e002f97534439950bcf1ba6a5c5dae90a5142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
