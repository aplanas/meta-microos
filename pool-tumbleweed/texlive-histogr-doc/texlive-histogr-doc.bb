SUMMARY = "Documentation for texlive-histogr"
DESCRIPTION = "This package includes the documentation for texlive-histogr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-histogr-doc-2023.209.1.01svn15878-54.1.noarch.rpm"
RPM_HASH = "7bde24d745f6cfa3257cf06f71ec2469eec72e2af54e02d4f4fcb807e06d196d3a98f87495f1d7ab4680ec37b24f8245bdd0702734b49c9ff0ae2159fd8e55b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-histogr-doc"

RDEPENDS:${PN} += ""

inherit rpm
