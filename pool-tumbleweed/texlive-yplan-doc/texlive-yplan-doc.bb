SUMMARY = "Documentation for texlive-yplan"
DESCRIPTION = "This package includes the documentation for texlive-yplan"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn34398"

RPM_NAME = "texlive-yplan-doc-2023.209.svn34398-53.2.noarch.rpm"
RPM_HASH = "dff6a19428d9b6d5bdc05e02ff0e6f0e57c0c39cdaecdd6beb8a44fe92953e5b6835b702b1b2288dcc0c6758188315a41cf30ba5890259c8e9c2c1afe9178be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yplan-doc"

RDEPENDS:${PN} += ""

inherit rpm
