SUMMARY = "Documentation for texlive-dutchcal"
DESCRIPTION = "This package includes the documentation for texlive-dutchcal"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-dutchcal-doc-2023.209.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "4f1b8cb4b940c1bac8b1db019f1bf54ef41aec0cd943787be56e164235de97ed8c86b65b442b95dd010eb22b0603ac48d58250c1b4ebad7fcb6b70e5941814c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dutchcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
