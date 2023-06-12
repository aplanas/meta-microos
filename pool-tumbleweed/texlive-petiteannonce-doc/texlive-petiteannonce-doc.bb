SUMMARY = "Documentation for texlive-petiteannonce"
DESCRIPTION = "This package includes the documentation for texlive-petiteannonce"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0001svn25915"

RPM_NAME = "texlive-petiteannonce-doc-2023.201.1.0001svn25915-51.1.noarch.rpm"
RPM_HASH = "676f948b9267c267a0da133980b10422dd2e7d8de1da93f39f975974a9f2e33b9e20cff79facbe03429a82349586415e26f05deb0914a4cfc69126f73d81f584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-petiteannonce-doc"
RDEPENDS:${PN} += ""

inherit rpm
