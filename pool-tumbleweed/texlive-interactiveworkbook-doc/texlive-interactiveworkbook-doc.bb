SUMMARY = "Documentation for texlive-interactiveworkbook"
DESCRIPTION = "This package includes the documentation for texlive-interactiveworkbook"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-interactiveworkbook-doc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "d0c0348b62be1716055c453d640506eb25e5b2359b44087cfa92110cbd8fd57614d4afc67ec54d64570f70fe85ec344e700a5215694fb5062213239c54a46777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interactiveworkbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
