SUMMARY = "Documentation for texlive-piff"
DESCRIPTION = "This package includes the documentation for texlive-piff"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn21894"

RPM_NAME = "texlive-piff-doc-2023.209.svn21894-52.1.noarch.rpm"
RPM_HASH = "229cdb880781027c1f3fec1caff8ceaa091fced5dda7ad165ba1822080eff5fd741f839308f523f69e2c1af02a0326c42a7a4ad9e4de696d5111dc7d5e2834d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piff-doc"

RDEPENDS:${PN} += ""

inherit rpm
