SUMMARY = "Documentation for texlive-newverbs"
DESCRIPTION = "This package includes the documentation for texlive-newverbs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6asvn64833"

RPM_NAME = "texlive-newverbs-doc-2023.201.1.6asvn64833-54.1.noarch.rpm"
RPM_HASH = "a4dd6af079a136bab7d0945f5d5e17b88ea8dba344b950f21c7e796f3333a862ee6e65c2fa0d32745288040ad0f29dd175c0be44903fdabe0d640ee927aec500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newverbs-doc"

RDEPENDS:${PN} += ""

inherit rpm
