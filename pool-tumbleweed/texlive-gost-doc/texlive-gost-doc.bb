SUMMARY = "Documentation for texlive-gost"
DESCRIPTION = "This package includes the documentation for texlive-gost"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2lsvn57616"

RPM_NAME = "texlive-gost-doc-2023.201.1.2lsvn57616-53.2.noarch.rpm"
RPM_HASH = "a1bf4d0dd0ced42fe963266bb0843f7aca2f7cc33825e61a5d42ac68f2f2bb548e4eb4f49ee5a9d4c984d849dd24f31f327481ee2776bd41e70be62ffc15490b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gost-doc-en \
texlive-gost-doc"

RDEPENDS:${PN} += ""

inherit rpm
