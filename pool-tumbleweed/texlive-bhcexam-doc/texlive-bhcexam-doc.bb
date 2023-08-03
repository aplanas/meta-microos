SUMMARY = "Documentation for texlive-bhcexam"
DESCRIPTION = "This package includes the documentation for texlive-bhcexam"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn64093"

RPM_NAME = "texlive-bhcexam-doc-2023.209.1.7svn64093-54.1.noarch.rpm"
RPM_HASH = "92dc530e0d95345d5f04170289e1ab5ec10624770fedc2bcdf7e663ed8fee0e5363010b3c49e31609b35f695c47adb9059d8eb4d05e62df96c4d22795e6679ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bhcexam-doc-zh \
texlive-bhcexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
