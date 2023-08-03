SUMMARY = "Documentation for texlive-nddiss"
DESCRIPTION = "This package includes the documentation for texlive-nddiss"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2017.2svn45107"

RPM_NAME = "texlive-nddiss-doc-2023.209.3.2017.2svn45107-55.1.noarch.rpm"
RPM_HASH = "274871e965355a6fd1ce46f885d79bcf045fc3486e40fd16b1e0828c49321d6e021bd6805356c8886975fe14e5d45466bc2300964d6246cd7df2ff83100a4bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nddiss-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
