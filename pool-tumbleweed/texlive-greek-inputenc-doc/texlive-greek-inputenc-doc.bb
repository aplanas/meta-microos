SUMMARY = "Documentation for texlive-greek-inputenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-inputenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8.2svn66296"

RPM_NAME = "texlive-greek-inputenc-doc-2023.209.1.8.2svn66296-54.1.noarch.rpm"
RPM_HASH = "50956c138af358416a014e63529c43e7fb7440a04edc61841bb4cd85e8a9a5792b12e134b73c004bf8fd7e19fda5d20048e272cd2ddf16053557f9b570339429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-inputenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
