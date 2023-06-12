SUMMARY = "Documentation for texlive-hobby"
DESCRIPTION = "This package includes the documentation for texlive-hobby"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn44474"

RPM_NAME = "texlive-hobby-doc-2023.201.1.8svn44474-53.1.noarch.rpm"
RPM_HASH = "1edc1a0eec7fbf3a248a1988bf0e499335b2fee91950cf2747e93291878692b9aee04fae8739262cf6483df54f1d50b6cfe315564d0301a35a7ed0e9a685217b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobby-doc"
RDEPENDS:${PN} += ""

inherit rpm
