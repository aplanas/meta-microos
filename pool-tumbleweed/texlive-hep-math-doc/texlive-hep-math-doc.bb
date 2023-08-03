SUMMARY = "Documentation for texlive-hep-math"
DESCRIPTION = "This package includes the documentation for texlive-hep-math"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64905"

RPM_NAME = "texlive-hep-math-doc-2023.209.1.1svn64905-54.1.noarch.rpm"
RPM_HASH = "9d7259513845a376fea246d47f54a53095b55f73c82c33259dd1c96d1519ed14942fcfbfeb5f4aee6123ac696da293821d42ec0d3d8f482bb2614ac2b5745fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
