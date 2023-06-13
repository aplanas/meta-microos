SUMMARY = "Documentation for texlive-rcsinfo"
DESCRIPTION = "This package includes the documentation for texlive-rcsinfo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-doc-2023.201.1.11svn15878-53.1.noarch.rpm"
RPM_HASH = "684cf74e2da407fed3de05475ee6001f705163e102b604af53665034e42c276ff0688eb455b251a56d98ce58f0ed5efa7401e32ccc3f4588428fa576f513e2f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcsinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
