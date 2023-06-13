SUMMARY = "Documentation for texlive-dk-bib"
DESCRIPTION = "This package includes the documentation for texlive-dk-bib"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-dk-bib-doc-2023.201.0.0.6svn15878-52.1.noarch.rpm"
RPM_HASH = "100fbdb47f78c10c1c27c80fb7fba6775e556cfa63ab0571894568c04dc0a565b044eb903d4b4c8596c3c97a835ad4db0071e4e17f194d109d6c33d6dfe8dc2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dk-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
