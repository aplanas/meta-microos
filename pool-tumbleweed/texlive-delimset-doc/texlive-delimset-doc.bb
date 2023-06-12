SUMMARY = "Documentation for texlive-delimset"
DESCRIPTION = "This package includes the documentation for texlive-delimset"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49544"

RPM_NAME = "texlive-delimset-doc-2023.201.1.1svn49544-52.1.noarch.rpm"
RPM_HASH = "a92a213b0d54d1fea4600b456f0acb48c35bcdf7d634720c78082a6da7964cf4eb99e6d036da5ba8460552322a3144e73062f0c2802f143f7f83cab7ebd0f8d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimset-doc"
RDEPENDS:${PN} += ""

inherit rpm
