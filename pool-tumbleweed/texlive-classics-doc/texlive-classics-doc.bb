SUMMARY = "Documentation for texlive-classics"
DESCRIPTION = "This package includes the documentation for texlive-classics"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn53671"

RPM_NAME = "texlive-classics-doc-2023.201.0.0.1asvn53671-53.1.noarch.rpm"
RPM_HASH = "14c01419b95286f0520224ff371fefaab9d3ea6a2287d1a372fbb8716bf840f85739e5da6aff5c4e26a539e28d9fda4cd78e06dd57309226d495ef3b93abaea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classics-doc"
RDEPENDS:${PN} += ""

inherit rpm
