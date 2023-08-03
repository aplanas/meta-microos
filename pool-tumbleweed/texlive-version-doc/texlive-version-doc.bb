SUMMARY = "Documentation for texlive-version"
DESCRIPTION = "This package includes the documentation for texlive-version"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn21920"

RPM_NAME = "texlive-version-doc-2023.209.2.0svn21920-54.1.noarch.rpm"
RPM_HASH = "a0366499abb5d84b64faea6b640f67248794d91977198799994975d586c6e5166b60776c2bceb8ec1bc98f5f8e1a723f0b7cf7c8175f5522614c553c87a08726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-version-doc"

RDEPENDS:${PN} += ""

inherit rpm
