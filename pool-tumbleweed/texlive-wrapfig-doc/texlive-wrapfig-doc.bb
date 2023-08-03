SUMMARY = "Documentation for texlive-wrapfig"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn61719"

RPM_NAME = "texlive-wrapfig-doc-2023.209.3.6svn61719-53.1.noarch.rpm"
RPM_HASH = "29a7dce890c5b556338f40fbfbaa32c1aea5782276f4f4d14ab8f36cc10c196afe9819f02e9944478cdb3099b5afcf2b6b33c9bd14a6bbdc1b8577a7c3b1c972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
