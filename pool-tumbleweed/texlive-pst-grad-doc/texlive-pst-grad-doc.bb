SUMMARY = "Documentation for texlive-pst-grad"
DESCRIPTION = "This package includes the documentation for texlive-pst-grad"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn15878"

RPM_NAME = "texlive-pst-grad-doc-2023.201.1.06svn15878-52.1.noarch.rpm"
RPM_HASH = "56baebba008ddb11cad226118a6efe3ef3db14c25b886835121b607396c46f345a36c96ec00672ea388fad31c65b7e0b671d228d7a762200f949a070f93128b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-grad-doc"
RDEPENDS:${PN} += ""

inherit rpm
