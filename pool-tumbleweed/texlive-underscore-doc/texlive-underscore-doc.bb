SUMMARY = "Documentation for texlive-underscore"
DESCRIPTION = "This package includes the documentation for texlive-underscore"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18261"

RPM_NAME = "texlive-underscore-doc-2023.209.svn18261-54.1.noarch.rpm"
RPM_HASH = "781e22dc01eaf0de84bfb854663375938034f12c3d5f487931712052c5baf4851768b5b79f44c98f5560413eeae062b8a07e9253e6482aa46553f79044c29525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-underscore-doc"

RDEPENDS:${PN} += ""

inherit rpm
