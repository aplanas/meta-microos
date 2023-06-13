SUMMARY = "Documentation for texlive-hvpygmentex"
DESCRIPTION = "This package includes the documentation for texlive-hvpygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn62405"

RPM_NAME = "texlive-hvpygmentex-doc-2023.201.0.0.01svn62405-52.1.noarch.rpm"
RPM_HASH = "932c3f4df86253f7a53fbbf964350df7af283d3ec8d374d9ae24981ef1b4b2bcded01bb49a18912b812320e629b738fa5abce3875477017fb804e844a5081a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvpygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
