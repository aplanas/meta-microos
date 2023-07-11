SUMMARY = "Documentation for texlive-ieeepes"
DESCRIPTION = "This package includes the documentation for texlive-ieeepes"
LICENSE = "LPPL-1.0"

PV = "2023.208.4.0svn17359"

RPM_NAME = "texlive-ieeepes-doc-2023.208.4.0svn17359-53.1.noarch.rpm"
RPM_HASH = "b1376a2baa261ba118db9daf86f190606661d168ce46f7772c75eab09d4d077190c38f1bf02cb00d6637547b9837a4a9b5211b90b9f706b0463dbb50a588ca9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeepes-doc"

RDEPENDS:${PN} += ""

inherit rpm
