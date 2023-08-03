SUMMARY = "Documentation for texlive-random"
DESCRIPTION = "This package includes the documentation for texlive-random"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn54723"

RPM_NAME = "texlive-random-doc-2023.209.0.0.2svn54723-54.1.noarch.rpm"
RPM_HASH = "c1ea9307fdaedffd0025e1454e9419d75a99e63e609b21ed82d62b1d73eca778cd827d41d0c3ef31cda7a19894d48590ed1aad8e73b4a40e29886d90dfbf8a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-random-doc"

RDEPENDS:${PN} += ""

inherit rpm
