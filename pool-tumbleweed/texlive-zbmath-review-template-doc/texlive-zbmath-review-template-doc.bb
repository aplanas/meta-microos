SUMMARY = "Documentation for texlive-zbmath-review-template"
DESCRIPTION = "This package includes the documentation for texlive-zbmath-review-template"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn59693"

RPM_NAME = "texlive-zbmath-review-template-doc-2023.209.2.1svn59693-53.2.noarch.rpm"
RPM_HASH = "59e9a6c3aa89a565d022685f6029f1b0328e0b88bff7107b0646728bb700fb2689f12ace9f0b2229a8ae1b843205827aa41e05264c68c110d3948416277f9257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zbmath-review-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
