SUMMARY = "Documentation for texlive-tikzmarmots"
DESCRIPTION = "This package includes the documentation for texlive-tikzmarmots"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-tikzmarmots-doc-2023.209.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "3fede98fa7785af252c702f635dac5b2c7ea801ac3fed2f0e4d80abc16d44f4090d7b80d7eb820e9bd1d4b8eae917112b88a84b5504d7f0833514eb1d3b7e276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzmarmots-doc"

RDEPENDS:${PN} += ""

inherit rpm
