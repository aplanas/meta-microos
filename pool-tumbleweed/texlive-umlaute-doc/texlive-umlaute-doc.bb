SUMMARY = "Documentation for texlive-umlaute"
DESCRIPTION = "This package includes the documentation for texlive-umlaute"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-umlaute-doc-2023.209.2.1svn15878-54.1.noarch.rpm"
RPM_HASH = "dc9e89a6d6c86efa14e73a85dce943dfa8436729f4aae5a3d9334372cbd3dabfd6a1219f0119f967cf8f30169725c96c3b55fcb21a13f43dd0aa4cd5b0841e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umlaute-doc"

RDEPENDS:${PN} += ""

inherit rpm
