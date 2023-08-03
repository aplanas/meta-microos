SUMMARY = "Documentation for texlive-h2020proposal"
DESCRIPTION = "This package includes the documentation for texlive-h2020proposal"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-doc-2023.209.1.0svn38428-54.1.noarch.rpm"
RPM_HASH = "0b433e28c8cd61866c240051fbd11a9ef72436dbf9bf1260849f60c5d8e3a894c56cf4ce7e3e9e8ec3ae3a888912dfc4b389969b5f026ddc8f559d40442bf7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-h2020proposal-doc"

RDEPENDS:${PN} += ""

inherit rpm
