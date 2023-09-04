SUMMARY = "Documentation for texlive-esindex"
DESCRIPTION = "This package includes the documentation for texlive-esindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn52342"

RPM_NAME = "texlive-esindex-doc-2023.209.1.7svn52342-54.2.noarch.rpm"
RPM_HASH = "0d56e13cb693a46d8970583273f4d5955b7e7142e723b38512c00b9601ba49cd10e7998371c3aeddf4831f6998f7fd8b163ddc5d5d8b6466aaa2ef5014178e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
