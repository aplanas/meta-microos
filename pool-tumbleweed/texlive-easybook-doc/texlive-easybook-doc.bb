SUMMARY = "Documentation for texlive-easybook"
DESCRIPTION = "This package includes the documentation for texlive-easybook"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.71dsvn64976"

RPM_NAME = "texlive-easybook-doc-2023.209.1.71dsvn64976-54.2.noarch.rpm"
RPM_HASH = "20aa9704120ad30c84df983c11eb4069874da9ea11e5cdf977d322c7beeaa9914743b6a1b53ab2e713eeebe636d7ac6985bebc39a5a1e5d43cd95313d98de73a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-easybook-doc-zh \
texlive-easybook-doc"

RDEPENDS:${PN} += ""

inherit rpm
