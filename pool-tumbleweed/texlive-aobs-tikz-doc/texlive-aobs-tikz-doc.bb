SUMMARY = "Documentation for texlive-aobs-tikz"
DESCRIPTION = "This package includes the documentation for texlive-aobs-tikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn32662"

RPM_NAME = "texlive-aobs-tikz-doc-2023.201.1.0svn32662-54.1.noarch.rpm"
RPM_HASH = "9b3fd129569fc3655bbb27a2426133a2d5e83005ca41e30316e7723be59f4842dd67bf219f3ee263a0d1fb1d294916b3dc11f943d87e6347b76c25671774d83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aobs-tikz-doc"
RDEPENDS:${PN} += ""

inherit rpm
