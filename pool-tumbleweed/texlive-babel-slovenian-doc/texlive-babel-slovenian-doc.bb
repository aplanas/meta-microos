SUMMARY = "Documentation for texlive-babel-slovenian"
DESCRIPTION = "This package includes the documentation for texlive-babel-slovenian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2nsvn57666"

RPM_NAME = "texlive-babel-slovenian-doc-2023.201.1.2nsvn57666-53.1.noarch.rpm"
RPM_HASH = "5904f9c8650f9c079edf0a0c1eacc748b7a41b79afbb1dd330c4df2255128f03c0df8405f75c9f3209051c0de4b368384a6ca7018d61c405851483405844713d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-slovenian-doc"

RDEPENDS:${PN} += ""

inherit rpm
