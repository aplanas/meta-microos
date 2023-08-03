SUMMARY = "Documentation for texlive-fancyhandout"
DESCRIPTION = "This package includes the documentation for texlive-fancyhandout"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46411"

RPM_NAME = "texlive-fancyhandout-doc-2023.209.svn46411-53.1.noarch.rpm"
RPM_HASH = "2ab18b6813d5d1b20b299f2b7575c11ae328204082d81aaf61beded175ab5e43a392743df41bd882ddcee65eae3a012b8ce54b6bcf12c506510030d3eba8e4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhandout-doc"

RDEPENDS:${PN} += ""

inherit rpm
