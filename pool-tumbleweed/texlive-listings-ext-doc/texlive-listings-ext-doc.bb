SUMMARY = "Documentation for texlive-listings-ext"
DESCRIPTION = "This package includes the documentation for texlive-listings-ext"
LICENSE = "LPPL-1.0"

PV = "2023.201.67svn29349"

RPM_NAME = "texlive-listings-ext-doc-2023.201.67svn29349-54.1.noarch.rpm"
RPM_HASH = "133a90fa3b7c4d5ebba9cd60e674bb65d725bb51e65356ed67a7db1cc9388f930e6b0a3a394c4ad5a27d2bb887e01430aad59f178fcd24d0b4de6153a7595542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listings-ext-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
