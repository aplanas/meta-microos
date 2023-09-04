SUMMARY = "Documentation for texlive-grfpaste"
DESCRIPTION = "This package includes the documentation for texlive-grfpaste"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-doc-2023.209.0.0.2svn17354-54.2.noarch.rpm"
RPM_HASH = "733b37997dd78e7699ec510030c46f775ac2ca1934268c7d40fddc7ca7b6fb1cf170095fc302fc9fecd8246646e4200f82ee8775d999bb3ce4074db77c5d1e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfpaste-doc"

RDEPENDS:${PN} += ""

inherit rpm
