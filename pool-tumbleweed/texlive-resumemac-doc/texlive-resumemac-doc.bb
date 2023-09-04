SUMMARY = "Documentation for texlive-resumemac"
DESCRIPTION = "This package includes the documentation for texlive-resumemac"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-resumemac-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "e1ce484acd9d2f0c100dd7a434d5c4a9d4bed6041ff4057a4431a566a3a9be46ebda39c13cd9683336d0c13ee9c15c68eb1cc8b482ebaf2559ddbefc2175fe09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumemac-doc"

RDEPENDS:${PN} += ""

inherit rpm
