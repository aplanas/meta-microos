SUMMARY = "Documentation for texlive-csquotes"
DESCRIPTION = "This package includes the documentation for texlive-csquotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.2nsvn64389"

RPM_NAME = "texlive-csquotes-doc-2023.209.5.2nsvn64389-55.1.noarch.rpm"
RPM_HASH = "4ca4345581add5ebaacdfadfaacc277b308c2bf9b186f98f88402677dbda4396a5619eed3066049927404a0a5a0d503c4eb7edc9d7daf666aca733a3ee86f67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csquotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
