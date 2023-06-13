SUMMARY = "Documentation for texlive-ffslides"
DESCRIPTION = "This package includes the documentation for texlive-ffslides"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38895"

RPM_NAME = "texlive-ffslides-doc-2023.201.svn38895-52.1.noarch.rpm"
RPM_HASH = "728ae67118befd018a834c23e0cba758fa18fb8a161a86321657667a8d3618c24ccea43b19c9a493514ad4c985dbfa03164cd4ac1a41c23a58d19aefec85f8e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ffslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
