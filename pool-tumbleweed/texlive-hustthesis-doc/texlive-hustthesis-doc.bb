SUMMARY = "Documentation for texlive-hustthesis"
DESCRIPTION = "This package includes the documentation for texlive-hustthesis"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4svn42547"

RPM_NAME = "texlive-hustthesis-doc-2023.208.1.4svn42547-53.1.noarch.rpm"
RPM_HASH = "d2f23c901130bc84bb347485a3e0b5b38c9cb7f63ca1c3bf5286847f08a4a3f437343cd4eccbc4b1b88ee7cbb2acf41e4ba9152c1a5a2ead97085069bbfa9172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hustthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
