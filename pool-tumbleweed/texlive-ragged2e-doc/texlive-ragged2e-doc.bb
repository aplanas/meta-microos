SUMMARY = "Documentation for texlive-ragged2e"
DESCRIPTION = "This package includes the documentation for texlive-ragged2e"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.4svn66152"

RPM_NAME = "texlive-ragged2e-doc-2023.201.3.4svn66152-53.2.noarch.rpm"
RPM_HASH = "104d1998f84124ad51f2c9484dec850fab1d9a46f3745de62e5876d083422e980092298f84db8105103c754c65f0896443310031f43763c39f5bf3ed89c7fef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ragged2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
