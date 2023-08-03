SUMMARY = "Documentation for texlive-jobname-suffix"
DESCRIPTION = "This package includes the documentation for texlive-jobname-suffix"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64797"

RPM_NAME = "texlive-jobname-suffix-doc-2023.209.1.0svn64797-56.1.noarch.rpm"
RPM_HASH = "8f17ed28a688e9195247a1411c12a8fc57155bda51361a2e80103a156a8715a27354ef65e5e20b473f7147eb022f4e553e297591f0823258b3112dec9dc99b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jobname-suffix-doc"

RDEPENDS:${PN} += ""

inherit rpm
