SUMMARY = "Documentation for texlive-greektex"
DESCRIPTION = "This package includes the documentation for texlive-greektex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28327"

RPM_NAME = "texlive-greektex-doc-2023.209.svn28327-54.1.noarch.rpm"
RPM_HASH = "d8dd34aad21f537d7abf4c817d00f757d2c4187fd73006c984f52598ddb65add5c0eaa943d1bd422852c8d7d2ccf783ea719a8116b1b13c50f76cbb6eed61a24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektex-doc-el \
texlive-greektex-doc"

RDEPENDS:${PN} += ""

inherit rpm
