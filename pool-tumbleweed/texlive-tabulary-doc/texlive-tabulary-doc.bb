SUMMARY = "Documentation for texlive-tabulary"
DESCRIPTION = "This package includes the documentation for texlive-tabulary"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10svn34368"

RPM_NAME = "texlive-tabulary-doc-2023.209.0.0.10svn34368-55.1.noarch.rpm"
RPM_HASH = "79580e9a4d918c7142eb1bc1f784ae9e6c0c19445b25dd653dd1735cc76646a17daa7fae6d7121c328c82a52e119bf546fc5e6a234526aee347cf4f24829c121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabulary-doc"

RDEPENDS:${PN} += ""

inherit rpm
