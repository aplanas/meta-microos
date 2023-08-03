SUMMARY = "Documentation for texlive-theanomodern"
DESCRIPTION = "This package includes the documentation for texlive-theanomodern"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64520"

RPM_NAME = "texlive-theanomodern-doc-2023.209.svn64520-55.1.noarch.rpm"
RPM_HASH = "270ca0edbbd6ec87c42ecb8f90872945de33299c6562f1b6fc9ee85f0dcbdef65de4092e4292c83768122a475f0903a1c04e5e7310952984552b2afbc41cff27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanomodern-doc"

RDEPENDS:${PN} += ""

inherit rpm
