SUMMARY = "Documentation for texlive-xprintlen"
DESCRIPTION = "This package includes the documentation for texlive-xprintlen"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35928"

RPM_NAME = "texlive-xprintlen-doc-2023.209.1.0svn35928-53.2.noarch.rpm"
RPM_HASH = "1514c7b69796bf8b4542e3fef6133d458a9ba3e5b51f51627b0225fd112cd63c43f9055e6dae71c1b616d0d91fec652eccfdf0397446d15a99902fff8dedc9cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xprintlen-doc"

RDEPENDS:${PN} += ""

inherit rpm
