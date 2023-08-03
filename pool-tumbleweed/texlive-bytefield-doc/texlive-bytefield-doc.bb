SUMMARY = "Documentation for texlive-bytefield"
DESCRIPTION = "This package includes the documentation for texlive-bytefield"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn60265"

RPM_NAME = "texlive-bytefield-doc-2023.209.2.7svn60265-53.1.noarch.rpm"
RPM_HASH = "1e35b4373c4ea94a6f81419ebb13a634f3d4c633fde4180b9dcc26ef68333c08bceb9576dff29e79ca5aff74512f99dd0b9208d90dde61490942dbf77fef6ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bytefield-doc"

RDEPENDS:${PN} += ""

inherit rpm
