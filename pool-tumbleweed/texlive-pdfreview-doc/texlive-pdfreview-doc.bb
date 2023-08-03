SUMMARY = "Documentation for texlive-pdfreview"
DESCRIPTION = "This package includes the documentation for texlive-pdfreview"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn50100"

RPM_NAME = "texlive-pdfreview-doc-2023.209.1.2svn50100-52.1.noarch.rpm"
RPM_HASH = "48a48cf98b4c97fb39f2e56b734b2283b82388ebe31cf2a2dc91a23d42777a42ea8eaa936fcc0ba02e1899b0d72c71ad9df02c2784eb84a911509a18ba507d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfreview-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
