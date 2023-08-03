SUMMARY = "Documentation for texlive-mnotes"
DESCRIPTION = "This package includes the documentation for texlive-mnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn63406"

RPM_NAME = "texlive-mnotes-doc-2023.209.0.0.9svn63406-55.1.noarch.rpm"
RPM_HASH = "5964eb14c8961627509918528a60e13732b10ed88a77039af7b649b87bdf7aa9019edacdc5d738ffa217a59f45cab0a314d094ba4de2e4c91afc55e03218acd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
