SUMMARY = "Documentation for texlive-texdirflatten"
DESCRIPTION = "This package includes the documentation for texlive-texdirflatten"
LICENSE = "Artistic-1.0"

PV = "2023.209.1.3svn55064"

RPM_NAME = "texlive-texdirflatten-doc-2023.209.1.3svn55064-55.1.noarch.rpm"
RPM_HASH = "4ed08756664ebec3f599e138619a6b841ffc8e2d5f9e43c2fa25a0851a3b111566c859b64e2f9f4f572a84e61e81f07c70753d9b946b18723d89dc77c453e53c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdirflatten.1 \
texlive-texdirflatten-doc"

RDEPENDS:${PN} += ""

inherit rpm
