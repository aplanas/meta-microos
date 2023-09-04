SUMMARY = "Documentation for texlive-eqnarray"
DESCRIPTION = "This package includes the documentation for texlive-eqnarray"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn20641"

RPM_NAME = "texlive-eqnarray-doc-2023.209.1.3svn20641-54.2.noarch.rpm"
RPM_HASH = "1b52b5fea1476dc11ba625ca66234a6c5c56c9bac1fab97cb1d1f39cd6ccd6a05c2bd23a29a818d8f3b0c5d71ad7512915ce04a8634c17c82af9066735301d73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
