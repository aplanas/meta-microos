SUMMARY = "Documentation for texlive-statistik"
DESCRIPTION = "This package includes the documentation for texlive-statistik"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.03svn20334"

RPM_NAME = "texlive-statistik-doc-2023.201.0.0.03svn20334-57.1.noarch.rpm"
RPM_HASH = "d03904b8068d9f3be477fa438f36e577c2613175901e2371da196705c39f894eada5fd37f3dfa8298ac40a1d63ce8d12cedd792b59d7bfd2afa5e847ca169ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statistik-doc"
RDEPENDS:${PN} += ""

inherit rpm
