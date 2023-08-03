SUMMARY = "Documentation for texlive-yannisgr"
DESCRIPTION = "This package includes the documentation for texlive-yannisgr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22613"

RPM_NAME = "texlive-yannisgr-doc-2023.209.svn22613-53.1.noarch.rpm"
RPM_HASH = "cdde74663b35cfc9dea4b330382f4be25a39cc187158b5af843ee73cfc11ee826bf20fe5004c4e7dd480b176b97998e3ad83ec15e67e58e08d0767ff4bd69a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yannisgr-doc"

RDEPENDS:${PN} += ""

inherit rpm
