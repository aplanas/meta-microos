SUMMARY = "Documentation for texlive-onlyamsmath"
DESCRIPTION = "This package includes the documentation for texlive-onlyamsmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.20svn42927"

RPM_NAME = "texlive-onlyamsmath-doc-2023.201.0.0.20svn42927-54.1.noarch.rpm"
RPM_HASH = "af14f8cb0fbff05a3a0f28e47b102abb11c8ab8b3faf1ec2756d587e2a23185b0a59f10bfee8fa2bc0637d258ad3a7050b5bccf9f131f13e4e686551a88e71b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onlyamsmath-doc"
RDEPENDS:${PN} += ""

inherit rpm
