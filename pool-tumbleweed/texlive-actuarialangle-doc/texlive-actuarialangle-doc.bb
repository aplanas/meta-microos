SUMMARY = "Documentation for texlive-actuarialangle"
DESCRIPTION = "This package includes the documentation for texlive-actuarialangle"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn51376"

RPM_NAME = "texlive-actuarialangle-doc-2023.201.2.1svn51376-54.1.noarch.rpm"
RPM_HASH = "8f722e3671999cb89499db6225c701b1e363f91f41ec7365fd28a572971a9fd33c9796620a724d45576b98e4faab10e27e0629116b0958dddb4be0f5e9ac552c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-actuarialangle-doc"
RDEPENDS:${PN} += ""

inherit rpm
