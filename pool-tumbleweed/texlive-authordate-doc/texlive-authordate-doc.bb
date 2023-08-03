SUMMARY = "Documentation for texlive-authordate"
DESCRIPTION = "This package includes the documentation for texlive-authordate"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn52564"

RPM_NAME = "texlive-authordate-doc-2023.209.svn52564-54.1.noarch.rpm"
RPM_HASH = "fc0b54df384d9a0b90cf9de9391b68b95b6418ba4afcfeb978d55dd634b6699ddc2b422cea292cc968462bb5afc5af41277b2a3d6f183381a5e6777f8c207e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authordate-doc"

RDEPENDS:${PN} += ""

inherit rpm
