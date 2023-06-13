SUMMARY = "Documentation for texlive-blacklettert1"
DESCRIPTION = "This package includes the documentation for texlive-blacklettert1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-blacklettert1-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "42c838a8d04a4708004ae07401100549f4ddc20c6c891628eacd34e0d99ed2f67eacf2fce891c9a318f5238ba42355814640e6eb0a5d93a9720fa5db7b45df8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blacklettert1-doc"

RDEPENDS:${PN} += ""

inherit rpm
