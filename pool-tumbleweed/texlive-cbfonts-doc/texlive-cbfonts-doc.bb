SUMMARY = "Documentation for texlive-cbfonts"
DESCRIPTION = "This package includes the documentation for texlive-cbfonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-cbfonts-doc-2023.209.svn54080-53.1.noarch.rpm"
RPM_HASH = "34230a1e85242512a56d2beaaf402e1790843513076fc9ac9937ce48d1f96f18f3c537a1997b57599f1f4a58d7ce1e54fdb9e756be949409229ff86e5c74a5c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
