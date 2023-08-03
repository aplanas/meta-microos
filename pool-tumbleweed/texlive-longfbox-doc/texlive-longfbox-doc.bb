SUMMARY = "Documentation for texlive-longfbox"
DESCRIPTION = "This package includes the documentation for texlive-longfbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39028"

RPM_NAME = "texlive-longfbox-doc-2023.209.1.0svn39028-55.1.noarch.rpm"
RPM_HASH = "1230c4ee0d9ef6f35167b5c8b0694bb72c4f66a8cc6e3cc1579f4406eebb675c067176877c57dc2c0c3cf144a4a9b5f4b0bb6303c1c084d86cad6138bde59fde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longfbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
