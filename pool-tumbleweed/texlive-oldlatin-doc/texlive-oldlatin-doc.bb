SUMMARY = "Documentation for texlive-oldlatin"
DESCRIPTION = "This package includes the documentation for texlive-oldlatin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn17932"

RPM_NAME = "texlive-oldlatin-doc-2023.201.1.00svn17932-54.1.noarch.rpm"
RPM_HASH = "389547ccce4637f71ec2183885ab65f0bb85d9af2091eaa2b68afe6155edd52d12a42c942e85e79cab309190ec2cd0ec33322decb1765991badf2e97910c87e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldlatin-doc"

RDEPENDS:${PN} += ""

inherit rpm
