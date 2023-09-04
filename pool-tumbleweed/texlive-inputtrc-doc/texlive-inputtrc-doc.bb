SUMMARY = "Documentation for texlive-inputtrc"
DESCRIPTION = "This package includes the documentation for texlive-inputtrc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn28019"

RPM_NAME = "texlive-inputtrc-doc-2023.209.0.0.3svn28019-54.1.noarch.rpm"
RPM_HASH = "186b093abe8ef399ca8c60767f5bc58f442b8e60bb4a64242e4ee6ad19abeff934e50290108c68ba3b8df3e6247c15899b50f66f69cea15e2423d68f74ab4629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputtrc-doc"

RDEPENDS:${PN} += ""

inherit rpm
