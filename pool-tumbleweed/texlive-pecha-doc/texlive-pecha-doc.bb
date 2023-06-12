SUMMARY = "Documentation for texlive-pecha"
DESCRIPTION = "This package includes the documentation for texlive-pecha"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-pecha-doc-2023.201.0.0.1svn15878-51.1.noarch.rpm"
RPM_HASH = "2d8126919a46e989e3793cb842b37bc5a7fca306142f4140337d9760499c6ae8c8d10effe8174383d362a2cd444cfa015b46f1ff7fb1db5c49e8e710e6eb4687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pecha-doc"
RDEPENDS:${PN} += ""

inherit rpm
