SUMMARY = "Documentation for texlive-hanzibox"
DESCRIPTION = "This package includes the documentation for texlive-hanzibox"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.0svn63062"

RPM_NAME = "texlive-hanzibox-doc-2023.209.2.3.0svn63062-54.2.noarch.rpm"
RPM_HASH = "36483f854bc52f9133121ceeb565fbe0b5c6f19ad43483f919687501a8e80fbfd1f14ff0db2d9e56cd1d22778e81f1075945b98f127c748a815c94cea71fe37a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hanzibox-doc-zh \
texlive-hanzibox-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
