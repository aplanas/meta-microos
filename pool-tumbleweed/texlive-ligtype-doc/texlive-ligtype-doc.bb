SUMMARY = "Documentation for texlive-ligtype"
DESCRIPTION = "This package includes the documentation for texlive-ligtype"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1bsvn63577"

RPM_NAME = "texlive-ligtype-doc-2023.209.0.0.1bsvn63577-55.1.noarch.rpm"
RPM_HASH = "10b951716b0ca5b02f57ac70a5cf3329a8abcc2efa2e40e00a38f8319362ec82648a482e59cc18615a90d285e719be161b61b2eb964178f7f9e8097cf392c902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ligtype-doc"

RDEPENDS:${PN} += ""

inherit rpm
