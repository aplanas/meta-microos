SUMMARY = "Documentation for texlive-xltxtra"
DESCRIPTION = "This package includes the documentation for texlive-xltxtra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn56594"

RPM_NAME = "texlive-xltxtra-doc-2023.201.0.0.7svn56594-52.2.noarch.rpm"
RPM_HASH = "13afce8bcc2b13add268ffa380f9766950b7f988b92d4956332d1f795237f2f014eba867f84a46c5f048b127160eed8c0c8124bac492fa8188eeb6674d8b5be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltxtra-doc"

RDEPENDS:${PN} += ""

inherit rpm
