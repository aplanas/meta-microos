SUMMARY = "Documentation for texlive-snaptodo"
DESCRIPTION = "This package includes the documentation for texlive-snaptodo"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61155"

RPM_NAME = "texlive-snaptodo-doc-2023.201.svn61155-57.1.noarch.rpm"
RPM_HASH = "40b5a2d9a94db6a89ce1420e1e1a1aa5a1550a3f7bf3e1d0437865ebeaa7a43b059f5025bfc133e882e8b408ff4ed7431e4336997e65958529324dbe1e9a6950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snaptodo-doc"
RDEPENDS:${PN} += ""

inherit rpm
