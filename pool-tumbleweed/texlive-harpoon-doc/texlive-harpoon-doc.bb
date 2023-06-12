SUMMARY = "Documentation for texlive-harpoon"
DESCRIPTION = "This package includes the documentation for texlive-harpoon"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn21327"

RPM_NAME = "texlive-harpoon-doc-2023.201.1.0svn21327-53.1.noarch.rpm"
RPM_HASH = "1d9d32f866fdaa6b25a484e2ad31e6a1d876258e85fe5d8f89511c592ed3ab82411b9686bd1217a9bd3f3e7d4866f7a93d768501bc4cbeeee92ee7b0c0f57a64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harpoon-doc"
RDEPENDS:${PN} += ""

inherit rpm
