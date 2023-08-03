SUMMARY = "Documentation for texlive-fontsetup"
DESCRIPTION = "This package includes the documentation for texlive-fontsetup"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.4svn65439"

RPM_NAME = "texlive-fontsetup-doc-2023.209.1.4svn65439-53.1.noarch.rpm"
RPM_HASH = "3309862631dba005acad7271e893c8602b4e4b1a5e5de68150090bc4758be9aaf85e3d50be3cf0f4e5f25862302901f9f1707ab0e19eda3132d2ef636117eebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontsetup-doc"

RDEPENDS:${PN} += ""

inherit rpm
