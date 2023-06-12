SUMMARY = "Documentation for texlive-universalis"
DESCRIPTION = "This package includes the documentation for texlive-universalis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64505"

RPM_NAME = "texlive-universalis-doc-2023.201.svn64505-53.1.noarch.rpm"
RPM_HASH = "469241674875df29bb834cf697f452ebbc0a58920d9c91d37f4fada3735bc7adff1338d9ec73a26df1013d1e6d6de5642f05f5f275e62aae16a7e05efb84d1a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-universalis-doc"
RDEPENDS:${PN} += ""

inherit rpm
