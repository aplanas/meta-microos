SUMMARY = "Documentation for texlive-sitem"
DESCRIPTION = "This package includes the documentation for texlive-sitem"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn22136"

RPM_NAME = "texlive-sitem-doc-2023.209.1.0svn22136-58.1.noarch.rpm"
RPM_HASH = "f36c9c9aeb8cca37978b79013e01a6209db1ab4aa016129523dee12f8adf2356eae4d73e6fd9bd4721f6fe52a0e7cd398750fd38e80ed631283db60370de3ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
