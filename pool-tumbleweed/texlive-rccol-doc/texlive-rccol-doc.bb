SUMMARY = "Documentation for texlive-rccol"
DESCRIPTION = "This package includes the documentation for texlive-rccol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2csvn15878"

RPM_NAME = "texlive-rccol-doc-2023.209.1.2csvn15878-54.2.noarch.rpm"
RPM_HASH = "80bde6e681ea8946815265b546344df73038ec00a34c7e6404151b63c3317e5ac8e21c83a506707b521bf7efb05e061a3ce6b5011929b34c3e85e6b35c09d3f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rccol-doc"

RDEPENDS:${PN} += ""

inherit rpm
