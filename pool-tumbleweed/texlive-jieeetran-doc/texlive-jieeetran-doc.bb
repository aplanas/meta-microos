SUMMARY = "Documentation for texlive-jieeetran"
DESCRIPTION = "This package includes the documentation for texlive-jieeetran"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn65642"

RPM_NAME = "texlive-jieeetran-doc-2023.201.0.0.19svn65642-55.1.noarch.rpm"
RPM_HASH = "5e8be52d4461e9b127b82c9dd91adf9e4d2ec29d300b0dc365fa0c4cc7ed9108066faffe68eb614aa0827c06941f6a41ab4bdc1e0493d043515460823d5064d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jieeetran-doc-ja \
texlive-jieeetran-doc"

RDEPENDS:${PN} += ""

inherit rpm
