SUMMARY = "Documentation for texlive-footnpag"
DESCRIPTION = "This package includes the documentation for texlive-footnpag"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-footnpag-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "51010a528ce7c4b1f84ec509f1eabd8d5e3bfa6d057b1698d27d0e57dd57d70ea5004cd8546296cd1aa6e8cc89b057ed2205c1f86be9c5e34952459b07e59c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnpag-doc"

RDEPENDS:${PN} += ""

inherit rpm
