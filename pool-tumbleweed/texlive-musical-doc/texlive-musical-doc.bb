SUMMARY = "Documentation for texlive-musical"
DESCRIPTION = "This package includes the documentation for texlive-musical"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn54758"

RPM_NAME = "texlive-musical-doc-2023.209.3.1svn54758-55.1.noarch.rpm"
RPM_HASH = "4e4ff3b7cab189c4a1f650e445bb4aca0d1bafbfac66ba6e7e180bf959cd7491172582123b5ffd1c42b2f8fc58fc62cb20859ce23487584696ca618074832c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musical-doc"

RDEPENDS:${PN} += ""

inherit rpm
