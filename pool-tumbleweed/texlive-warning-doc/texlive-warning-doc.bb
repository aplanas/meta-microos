SUMMARY = "Documentation for texlive-warning"
DESCRIPTION = "This package includes the documentation for texlive-warning"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn22028"

RPM_NAME = "texlive-warning-doc-2023.209.0.0.01svn22028-54.1.noarch.rpm"
RPM_HASH = "4a6d91e3c4112e0bdf392c8893c0c19bff058dc13572391cce863bca54d13983a874fee7fc2b1c15e0a6e429ddee1380eb9e34c96ad0aa2abeb04c0906b69baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-warning-doc"

RDEPENDS:${PN} += ""

inherit rpm
