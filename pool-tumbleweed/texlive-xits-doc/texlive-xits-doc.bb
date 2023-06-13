SUMMARY = "Documentation for texlive-xits"
DESCRIPTION = "This package includes the documentation for texlive-xits"
LICENSE = "OFL-1.1"

PV = "2023.201.1.302svn55730"

RPM_NAME = "texlive-xits-doc-2023.201.1.302svn55730-52.1.noarch.rpm"
RPM_HASH = "f8cc4529d41c727b94da99d7c5a0a4b1fce1ba38709cefe34ca3ee3a83fc2279c7255bc91a460bdd8f1f318903b6a5b4412670e25eca6bcde1a691c5673b5b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xits-doc"

RDEPENDS:${PN} += ""

inherit rpm
