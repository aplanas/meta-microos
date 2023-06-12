SUMMARY = "Documentation for texlive-ling-macros"
DESCRIPTION = "This package includes the documentation for texlive-ling-macros"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42268"

RPM_NAME = "texlive-ling-macros-doc-2023.201.svn42268-54.1.noarch.rpm"
RPM_HASH = "d0af63507b589aeceb3c2a5929f3800ac8d2e2c9b9f6c700216e7b72a8dc44064fc55a2f0d39cc487c19ec51e998957e26bb7a1334fc48c7cc158e66a9c1d9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ling-macros-doc"
RDEPENDS:${PN} += ""

inherit rpm
