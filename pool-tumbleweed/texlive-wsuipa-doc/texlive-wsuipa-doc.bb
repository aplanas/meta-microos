SUMMARY = "Documentation for texlive-wsuipa"
DESCRIPTION = "This package includes the documentation for texlive-wsuipa"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25469"

RPM_NAME = "texlive-wsuipa-doc-2023.201.svn25469-52.1.noarch.rpm"
RPM_HASH = "e8f23918e505072a63608eda4ffa0bf6475b708d4d722884698e9c71be119b3f567b5c8c94add94e11823168267dd86af546b53efd93da40d01470b63dfbf0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsuipa-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
