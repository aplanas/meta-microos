SUMMARY = "Documentation for texlive-bussproofs-extra"
DESCRIPTION = "This package includes the documentation for texlive-bussproofs-extra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn51299"

RPM_NAME = "texlive-bussproofs-extra-doc-2023.209.0.0.4svn51299-53.1.noarch.rpm"
RPM_HASH = "7747e75721165d66e42c3b333603677a4bcd018933b5f3229c9e10e6e94bb36a55285175d2fcc3350c21779af538b31e3390561b9fa02fdddee19ab264428623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bussproofs-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
