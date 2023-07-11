SUMMARY = "Documentation for texlive-luapstricks"
DESCRIPTION = "This package includes the documentation for texlive-luapstricks"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.8svn65913"

RPM_NAME = "texlive-luapstricks-doc-2023.208.0.0.8svn65913-53.1.noarch.rpm"
RPM_HASH = "73696b8d05381000d3f9835f6e19b5197332b7e147767e38af1feb7340017724ca83c77caf9d4fc165345d2aaa60bbb14607dc35ffbea0c7a1368e80b8159db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luapstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
