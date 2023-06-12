SUMMARY = "Documentation for texlive-pgfopts"
DESCRIPTION = "This package includes the documentation for texlive-pgfopts"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1asvn56615"

RPM_NAME = "texlive-pgfopts-doc-2023.201.2.1asvn56615-51.1.noarch.rpm"
RPM_HASH = "807b8ce62863430eb4ce49085bde9a9877644bb01a34848f906bb58b1ccd0db158995b797f12aafcb0341f31793ee3a20b813b0c298d73539d488da454d30a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfopts-doc"
RDEPENDS:${PN} += ""

inherit rpm
