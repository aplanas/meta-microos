SUMMARY = "Documentation for texlive-bold-extra"
DESCRIPTION = "This package includes the documentation for texlive-bold-extra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn17076"

RPM_NAME = "texlive-bold-extra-doc-2023.209.0.0.1svn17076-53.1.noarch.rpm"
RPM_HASH = "3c4fac362a32376f9cea8dc62c29a9e18d2b8bc4001252300cf3774d5a842839761473ee9e3442eb45878eff5b77f4a3ff353ed1732fc6ed0d1904b5b1be4d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bold-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
