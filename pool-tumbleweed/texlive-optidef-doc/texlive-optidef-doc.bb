SUMMARY = "Documentation for texlive-optidef"
DESCRIPTION = "This package includes the documentation for texlive-optidef"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn50941"

RPM_NAME = "texlive-optidef-doc-2023.209.3.1svn50941-55.1.noarch.rpm"
RPM_HASH = "026319c34bcf1146f88fa78d125aeb862baf4c7a022b1b27692b8f854053add6e5de07d3462f58024639d7ef7088af717810ffd9cb4ecb094b6a026fc1309622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optidef-doc"

RDEPENDS:${PN} += ""

inherit rpm
