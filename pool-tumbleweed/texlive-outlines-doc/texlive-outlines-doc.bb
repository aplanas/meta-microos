SUMMARY = "Documentation for texlive-outlines"
DESCRIPTION = "This package includes the documentation for texlive-outlines"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn25192"

RPM_NAME = "texlive-outlines-doc-2023.209.1.1svn25192-55.1.noarch.rpm"
RPM_HASH = "97d44363a87f3f1d75ac5fa2f9d075ecb52798f7d5334199056f54717dd7afe61cf390f21ddb9a9409f1d358d2f4b5c0f48a588106a70ccefa71c40534144f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
