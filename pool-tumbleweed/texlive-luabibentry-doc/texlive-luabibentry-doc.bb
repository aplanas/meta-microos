SUMMARY = "Documentation for texlive-luabibentry"
DESCRIPTION = "This package includes the documentation for texlive-luabibentry"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1asvn55777"

RPM_NAME = "texlive-luabibentry-doc-2023.208.0.0.1asvn55777-53.1.noarch.rpm"
RPM_HASH = "f57dbc74234fb28371f4d7759b2c8aef31889065fa4442d6e0c253f50d3edd04500842a92a180b1a9bab1bfc5d8c2f1eb330eb45d43c4979d78f942d94abe2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luabibentry-doc"

RDEPENDS:${PN} += ""

inherit rpm
