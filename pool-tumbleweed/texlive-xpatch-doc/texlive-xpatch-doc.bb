SUMMARY = "Documentation for texlive-xpatch"
DESCRIPTION = "This package includes the documentation for texlive-xpatch"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn54563"

RPM_NAME = "texlive-xpatch-doc-2023.201.0.0.3svn54563-52.2.noarch.rpm"
RPM_HASH = "ddcfe287e21a8d78af7d141d5cd890157c67f2f1961f8331b5cc19eb7e36cae505a59941eac392141184cfe0b87f0da4d7755d0a17c55fbf747a22876d26f12d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
