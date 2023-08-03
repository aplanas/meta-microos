SUMMARY = "Documentation for texlive-ran_toks"
DESCRIPTION = "This package includes the documentation for texlive-ran_toks"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59515"

RPM_NAME = "texlive-ran_toks-doc-2023.209.svn59515-54.1.noarch.rpm"
RPM_HASH = "22c6a3c78cc28e589b6c2d36ff5c964e72f41411f9f551b2266f1fd47014e06e69bf5f73c854bafb93a7ba4921f8f0ce0f54d507943349b991ed3a0ad2bd5de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ran-toks-doc"

RDEPENDS:${PN} += ""

inherit rpm
