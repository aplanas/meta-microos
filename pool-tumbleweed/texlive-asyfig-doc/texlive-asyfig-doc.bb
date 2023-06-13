SUMMARY = "Documentation for texlive-asyfig"
DESCRIPTION = "This package includes the documentation for texlive-asyfig"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn17512"

RPM_NAME = "texlive-asyfig-doc-2023.201.0.0.1csvn17512-53.1.noarch.rpm"
RPM_HASH = "c0b4b811cfea25f6b49ce84292d88c5cb7d8a42e224f8e09fd7fa596735eb619a6fdc9500a2430c819cd37176df8486b9d17d1f7a94646621fb6d64d9e478b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asyfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
