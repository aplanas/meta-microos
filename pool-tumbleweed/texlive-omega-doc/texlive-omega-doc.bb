SUMMARY = "Documentation for texlive-omega"
DESCRIPTION = "This package includes the documentation for texlive-omega"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn33046"

RPM_NAME = "texlive-omega-doc-2023.201.svn33046-54.1.noarch.rpm"
RPM_HASH = "2db8835ae0e98e86c67ac8c698b17777982b50bf13b61f481bfab1c727449393bceecf8eaa9db38005ea9378148c3407c28d9e457fc7f8458cdbff0ac04d451a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-omega-doc"

RDEPENDS:${PN} += ""

inherit rpm
