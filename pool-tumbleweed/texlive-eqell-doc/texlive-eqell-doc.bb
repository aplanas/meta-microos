SUMMARY = "Documentation for texlive-eqell"
DESCRIPTION = "This package includes the documentation for texlive-eqell"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22931"

RPM_NAME = "texlive-eqell-doc-2023.209.svn22931-54.1.noarch.rpm"
RPM_HASH = "ae77d287faedd20d7591e78f0993c72f01dffb5b1b74f2ae6350b37ee2410e43fd1bf121b72794f942b76271ba44676c86867bd5ed6c3f7a2ab24db4b449e940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqell-doc"

RDEPENDS:${PN} += ""

inherit rpm
