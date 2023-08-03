SUMMARY = "Documentation for texlive-pst-solarsystem"
DESCRIPTION = "This package includes the documentation for texlive-pst-solarsystem"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn45097"

RPM_NAME = "texlive-pst-solarsystem-doc-2023.209.0.0.13svn45097-54.1.noarch.rpm"
RPM_HASH = "1eda988e8d56d4e23a0fe53344c76b3607f402c0454f62148ee2d6ce40550f1ea34ae904efd9aa42b895b3a3813b25268d0483e8acf848c1cb994bf1158a409a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-solarsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
