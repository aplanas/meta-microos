SUMMARY = "Documentation for texlive-bestpapers"
DESCRIPTION = "This package includes the documentation for texlive-bestpapers"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn38708"

RPM_NAME = "texlive-bestpapers-doc-2023.209.1.0svn38708-54.1.noarch.rpm"
RPM_HASH = "5a16a260c2edebd932db09b53c8c31dc2f46252a8b5528dd59337062ea185cca191315e06e00ce8b0bb8b00eecc87f4b660419c34d2e7f1642c9de4b1203eca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bestpapers-doc"

RDEPENDS:${PN} += ""

inherit rpm
