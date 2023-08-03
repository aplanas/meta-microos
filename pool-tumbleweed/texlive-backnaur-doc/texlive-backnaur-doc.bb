SUMMARY = "Documentation for texlive-backnaur"
DESCRIPTION = "This package includes the documentation for texlive-backnaur"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn54080"

RPM_NAME = "texlive-backnaur-doc-2023.209.3.1svn54080-54.1.noarch.rpm"
RPM_HASH = "dcd7047b9cc1e9a33294af58dd687b0d2e4f5014376307b4dd59f1cd0c8dad94fca09a5de0c15fe420950ca6f1ff8f0b8c133a289de4ad3d4275117f1f62bea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-backnaur-doc"

RDEPENDS:${PN} += ""

inherit rpm
