SUMMARY = "Documentation for texlive-xnewcommand"
DESCRIPTION = "This package includes the documentation for texlive-xnewcommand"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-xnewcommand-doc-2023.209.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "ceeb2eb2a294e55a915e497bdc40d7de95b4832befa9e7b34b666cb3e7a85f932ba1e5ff661006ed21ef5f0e179f5036e7da615b17a84173167f4964eeecc09f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xnewcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
