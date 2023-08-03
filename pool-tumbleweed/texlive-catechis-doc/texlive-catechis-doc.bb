SUMMARY = "Documentation for texlive-catechis"
DESCRIPTION = "This package includes the documentation for texlive-catechis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn59998"

RPM_NAME = "texlive-catechis-doc-2023.209.2.6svn59998-53.1.noarch.rpm"
RPM_HASH = "ed65bb1e23b6226d3765621fa43db65767dcf1d4d09afa1abf59b503bcc823dae08316f4ae018809c3e8c9459a7494d08809d7d6493935d0cb16a285bf0f9169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catechis-doc"

RDEPENDS:${PN} += ""

inherit rpm
