SUMMARY = "Documentation for texlive-xespotcolor"
DESCRIPTION = "This package includes the documentation for texlive-xespotcolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn58212"

RPM_NAME = "texlive-xespotcolor-doc-2023.209.2.1svn58212-53.1.noarch.rpm"
RPM_HASH = "0edb5e9c000fcc98a128f9fa66cbcd9c236866755d6839e5801ad54086e8418279cb1e75c9e8a429eaf1810acd253776f1f07ec4cef624ed072d130eb534f75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xespotcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
