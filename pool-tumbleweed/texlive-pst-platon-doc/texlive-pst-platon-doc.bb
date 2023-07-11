SUMMARY = "Documentation for texlive-pst-platon"
DESCRIPTION = "This package includes the documentation for texlive-pst-platon"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-doc-2023.201.0.0.01svn16538-53.2.noarch.rpm"
RPM_HASH = "f7a15efdbac584be55b1b413362cd12ba57624adb6b89dedd5341541326571046460b18502820703616a4d28ff8e3718a5c829dd9327e4db00d42bcfcbe0449d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-platon-doc"

RDEPENDS:${PN} += ""

inherit rpm
