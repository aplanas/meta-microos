SUMMARY = "Documentation for texlive-pst-platon"
DESCRIPTION = "This package includes the documentation for texlive-pst-platon"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-doc-2023.209.0.0.01svn16538-54.1.noarch.rpm"
RPM_HASH = "ad15c54d02642707bed1e4da6a18ca4eaed028b9b4ff181fe73ce9c572623d97e7efa40652a3c4eebdc9951fe30623bed22fa0b8adc20ef3b703fbf7978dfb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-platon-doc"

RDEPENDS:${PN} += ""

inherit rpm
