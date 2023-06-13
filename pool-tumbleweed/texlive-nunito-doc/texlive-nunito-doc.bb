SUMMARY = "Documentation for texlive-nunito"
DESCRIPTION = "This package includes the documentation for texlive-nunito"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57429"

RPM_NAME = "texlive-nunito-doc-2023.201.0.0.0.1svn57429-54.1.noarch.rpm"
RPM_HASH = "af8fe7d0e8825ba3681274989f25a94f03c4694f97425ab2937a71617400fc4a2c4021036714c4e4286cdaf05923996d6410e7f8e667397319ebeb3414c93794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nunito-doc"

RDEPENDS:${PN} += ""

inherit rpm
