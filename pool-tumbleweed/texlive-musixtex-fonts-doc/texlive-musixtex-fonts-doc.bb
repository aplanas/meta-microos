SUMMARY = "Documentation for texlive-musixtex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-musixtex-fonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn65517"

RPM_NAME = "texlive-musixtex-fonts-doc-2023.201.svn65517-54.1.noarch.rpm"
RPM_HASH = "821c979f0734511085af4ae6497098f005b496fde287f1555e4e88bbe5398214f4dbf579d0e6d742248752f5ea04a2e2df5346f5e16a92272627c07a2358337f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musixtex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
