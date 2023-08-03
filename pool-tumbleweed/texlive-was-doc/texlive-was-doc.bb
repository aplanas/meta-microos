SUMMARY = "Documentation for texlive-was"
DESCRIPTION = "This package includes the documentation for texlive-was"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64691"

RPM_NAME = "texlive-was-doc-2023.209.svn64691-54.1.noarch.rpm"
RPM_HASH = "0c690f65e9fe6e44be4d6fc28d6b6b9e5f372e2970cc586b3a7bd289c3586373ec4e22e13cf821358d5c388b9f595a3c2e99584f0acb699aa644cbb6020aecb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-was-doc"

RDEPENDS:${PN} += ""

inherit rpm
