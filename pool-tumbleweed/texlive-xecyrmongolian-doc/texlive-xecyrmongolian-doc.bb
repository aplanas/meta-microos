SUMMARY = "Documentation for texlive-xecyrmongolian"
DESCRIPTION = "This package includes the documentation for texlive-xecyrmongolian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-doc-2023.209.1.0svn53160-53.1.noarch.rpm"
RPM_HASH = "6d274c657bb4e274e2c3813b4b575c36498011f43c2d81c3f24f61ea23f40eaed2565fdf4b3941ade231b674d6b332fa76593bf494d367d32fa96672742fa690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecyrmongolian-doc"

RDEPENDS:${PN} += ""

inherit rpm
