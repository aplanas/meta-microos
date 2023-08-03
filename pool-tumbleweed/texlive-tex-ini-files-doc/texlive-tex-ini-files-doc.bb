SUMMARY = "Documentation for texlive-tex-ini-files"
DESCRIPTION = "This package includes the documentation for texlive-tex-ini-files"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn40533"

RPM_NAME = "texlive-tex-ini-files-doc-2023.209.svn40533-55.1.noarch.rpm"
RPM_HASH = "fb7310da607d0edad1d4b2e2e2545a62e5616a7322ebe45e704ee2b1b1a831dcfb31c7948b6d172b33179b7cb014c2cfdcf291cd376bc0032afc13ca1d403f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-ini-files-doc"

RDEPENDS:${PN} += ""

inherit rpm
