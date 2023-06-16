SUMMARY = "Documentation for texlive-technics"
DESCRIPTION = "This package includes the documentation for texlive-technics"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29349"

RPM_NAME = "texlive-technics-doc-2023.201.1.0svn29349-54.1.noarch.rpm"
RPM_HASH = "4feb35740272a99b86cefdfe78ecd1c6fa6a494ecbd5c33dfe000cd0ada36afd20e510314a335f3812a325ed54659d2bba74f8775b572636b1b1877132877d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-technics-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
