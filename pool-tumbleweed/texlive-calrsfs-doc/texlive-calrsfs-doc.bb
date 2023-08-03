SUMMARY = "Documentation for texlive-calrsfs"
DESCRIPTION = "This package includes the documentation for texlive-calrsfs"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17125"

RPM_NAME = "texlive-calrsfs-doc-2023.209.svn17125-53.1.noarch.rpm"
RPM_HASH = "8934fb861f7c5124dc23e7d6048485530a4c5e9a4bdf8cb67ef5143890fe4ff2dc4f0fad7e1f395dbfbd18057a8461f84b600e9cc2ae0f0da114919669be4793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calrsfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
