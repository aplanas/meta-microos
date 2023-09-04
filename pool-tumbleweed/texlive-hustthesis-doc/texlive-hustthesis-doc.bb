SUMMARY = "Documentation for texlive-hustthesis"
DESCRIPTION = "This package includes the documentation for texlive-hustthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn42547"

RPM_NAME = "texlive-hustthesis-doc-2023.209.1.4svn42547-54.1.noarch.rpm"
RPM_HASH = "39f2fae8edb4c0ffb1c3f9de9a11b1ffeaa9d5f358c27dc5574222145070d61b96638efbdd2fdcedaec26ebc433878f6e5587591d00cd2abfd623933733f6a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hustthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
