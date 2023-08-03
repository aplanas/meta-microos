SUMMARY = "Documentation for texlive-haranoaji"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji"
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-doc-2023.209.20230223svn66115-54.1.noarch.rpm"
RPM_HASH = "aef7dd7147cd009890d36fcb7e6b234ec2b9f334147288afcf73516b08a4e3f81001cbc12a5ce02dbc0e76d15e91572a25452ca8fc84b114d389592d18b41889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-doc"

RDEPENDS:${PN} += ""

inherit rpm
