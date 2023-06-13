SUMMARY = "Documentation for texlive-savefnmark"
DESCRIPTION = "This package includes the documentation for texlive-savefnmark"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-savefnmark-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "fb96bbed66dae263de4af952446cae8e5cce59aa1d108e9e420716e26f6fefed2ab2e2aacfbcb46c4316db15e11aede80e29268b417c694cf4e4481b2d8d68c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-savefnmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
