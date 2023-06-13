SUMMARY = "Documentation for texlive-margbib"
DESCRIPTION = "This package includes the documentation for texlive-margbib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0csvn15878"

RPM_NAME = "texlive-margbib-doc-2023.201.1.0csvn15878-52.1.noarch.rpm"
RPM_HASH = "f006c67f8bcee1b850fcfed491b0012ae1bacc79c9c82e7daff6d42209a07f44db87d0863d7fba2ff18696b1b6e6101cc1b7dd4b93bfaedb8ee6ca4b1170c394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-margbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
