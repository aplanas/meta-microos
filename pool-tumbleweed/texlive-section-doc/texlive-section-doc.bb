SUMMARY = "Documentation for texlive-section"
DESCRIPTION = "This package includes the documentation for texlive-section"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20180"

RPM_NAME = "texlive-section-doc-2023.201.svn20180-53.1.noarch.rpm"
RPM_HASH = "d6a8d8e0ff5f42e6fda13b9dfc50bdcef7d47d6847579fbeeedb6896488d923ecda31e541285728598efc5d75cd165c95d57cc5811bddab559aaf2ae60aa1261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-section-doc"

RDEPENDS:${PN} += ""

inherit rpm
