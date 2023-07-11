SUMMARY = "Documentation for texlive-memorygraphs"
DESCRIPTION = "This package includes the documentation for texlive-memorygraphs"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1.1svn49631"

RPM_NAME = "texlive-memorygraphs-doc-2023.208.0.0.1.1svn49631-53.1.noarch.rpm"
RPM_HASH = "5077bdf9cb4ec250ee655ad60bf79c60570f86070c3b266835fdbb29dc2c06f9b31a835704074d7ba636ec2fda8a3a2ba7d9d0827740b4f146b64dce6ba767d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memorygraphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
