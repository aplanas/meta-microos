SUMMARY = "Documentation for texlive-forms16be"
DESCRIPTION = "This package includes the documentation for texlive-forms16be"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn51305"

RPM_NAME = "texlive-forms16be-doc-2023.201.1.3svn51305-52.1.noarch.rpm"
RPM_HASH = "777e45e4e7ffd5c7366047cdefcb0ff15239cdaf8f4e761375c1e6df095c3b772adf7b73c8972ba297382ed34c9d3ed6cf1f43fda14881f0648e545f926c78db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forms16be-doc"

RDEPENDS:${PN} += ""

inherit rpm
