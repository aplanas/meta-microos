SUMMARY = "Documentation for texlive-imakeidx"
DESCRIPTION = "This package includes the documentation for texlive-imakeidx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3esvn42287"

RPM_NAME = "texlive-imakeidx-doc-2023.209.1.3esvn42287-54.1.noarch.rpm"
RPM_HASH = "899dcee3bfe63827ca8edc6a2f91e413deba786bed78a50af6dba9d03d8ccf4197013bb156a070a0155be36eb65c39ba05200b396f7302b51e47b2e9dfd7de50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imakeidx-doc"

RDEPENDS:${PN} += ""

inherit rpm
