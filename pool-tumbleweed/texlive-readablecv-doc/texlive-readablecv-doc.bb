SUMMARY = "Documentation for texlive-readablecv"
DESCRIPTION = "This package includes the documentation for texlive-readablecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn61719"

RPM_NAME = "texlive-readablecv-doc-2023.209.3.0svn61719-54.1.noarch.rpm"
RPM_HASH = "3e53ebec97076adbb77e121ab30e4592dc9edb08c3a93fa942780658b6e159e147ffbe8700e7e9d33e5739e186ec024673e58aa98e66b5529a657368c24a5362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readablecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
