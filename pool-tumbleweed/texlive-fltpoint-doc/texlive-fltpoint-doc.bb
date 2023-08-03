SUMMARY = "Documentation for texlive-fltpoint"
DESCRIPTION = "This package includes the documentation for texlive-fltpoint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn56594"

RPM_NAME = "texlive-fltpoint-doc-2023.209.1.1bsvn56594-53.1.noarch.rpm"
RPM_HASH = "da60d213f979c86c37301208254551e432942a6848788d9e169c5b67dfee9877759fe5678c61bd07680db61fe0b9c5e5dcffc643b45f02647dbac5a4039c6dd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fltpoint-doc"

RDEPENDS:${PN} += ""

inherit rpm
