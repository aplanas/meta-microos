SUMMARY = "Documentation for texlive-captdef"
DESCRIPTION = "This package includes the documentation for texlive-captdef"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17353"

RPM_NAME = "texlive-captdef-doc-2023.209.svn17353-53.1.noarch.rpm"
RPM_HASH = "ccfe8584a2b197a2a6ffd1ef3951797a8712d0fb309a872e565eb38ca3909f7644c0b9733861501a1c8906cc63f146394451e5dfe5af3773a1c50870dfd78593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-captdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
