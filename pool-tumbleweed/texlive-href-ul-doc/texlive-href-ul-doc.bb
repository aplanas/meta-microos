SUMMARY = "Documentation for texlive-href-ul"
DESCRIPTION = "This package includes the documentation for texlive-href-ul"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn64880"

RPM_NAME = "texlive-href-ul-doc-2023.209.0.0.3.0svn64880-54.2.noarch.rpm"
RPM_HASH = "f0dc477e4848958cb68f6f75dac51b634bb55d2da3e8aadfe96a030e6fa562c0eea2fc28411553f711375fceeb5314ba3b076a49a6f92d532591c7bbd8f066df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-href-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
