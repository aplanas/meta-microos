SUMMARY = "Documentation for texlive-graphpaper"
DESCRIPTION = "This package includes the documentation for texlive-graphpaper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63116"

RPM_NAME = "texlive-graphpaper-doc-2023.201.1.1svn63116-53.1.noarch.rpm"
RPM_HASH = "e3003f6273d523c25ce1c3151fe8091d5ea14c178b40f23488c002dd79e06eee27600e2211e71405d43387fd8b12641e05961b7688d2c8fa7afbf55cadeedac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
