SUMMARY = "Documentation for texlive-grotesq"
DESCRIPTION = "This package includes the documentation for texlive-grotesq"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn35859"

RPM_NAME = "texlive-grotesq-doc-2023.201.svn35859-53.1.noarch.rpm"
RPM_HASH = "c041b98c2d3e80901321b22368d8ab0d0ce6cde3e976349c1732dffb057310f930f85798c5f1a9e901c4ca7b0cc32782eb8eb8e9f0e6cc814f8274a0fd3f255b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grotesq-doc"
RDEPENDS:${PN} += ""

inherit rpm
