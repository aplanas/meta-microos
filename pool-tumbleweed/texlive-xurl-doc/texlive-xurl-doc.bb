SUMMARY = "Documentation for texlive-xurl"
DESCRIPTION = "This package includes the documentation for texlive-xurl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10svn61553"

RPM_NAME = "texlive-xurl-doc-2023.201.0.0.10svn61553-52.2.noarch.rpm"
RPM_HASH = "29c8ef5e1cf63a5f8f19392535bc690980db26100bff12437ee3ec559f94ce6cc16c4203e2ee58535878fc050460b205a892321e760349473e8c4915d2e267c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
