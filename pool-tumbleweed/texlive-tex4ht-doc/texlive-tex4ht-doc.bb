SUMMARY = "Documentation for texlive-tex4ht"
DESCRIPTION = "This package includes the documentation for texlive-tex4ht"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66530"

RPM_NAME = "texlive-tex4ht-doc-2023.201.svn66530-54.1.noarch.rpm"
RPM_HASH = "5ae207353e11f9611c046400448f31f40530f75dad971acd83eb997fadec1878a62f0049efa0bee1fe63f8c52da76f4a6696b9b20161b32620325622fca141ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex4ht-doc"
RDEPENDS:${PN} += ""

inherit rpm
