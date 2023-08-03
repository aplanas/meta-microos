SUMMARY = "Documentation for texlive-datetime2-samin"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-samin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49346"

RPM_NAME = "texlive-datetime2-samin-doc-2023.209.1.1svn49346-53.1.noarch.rpm"
RPM_HASH = "2a418e83021a06816bb6a4fd4c78a4861ccb6c9e616330d99caba7caa6b8857c28ac8ebc422103fec90290cbca44ad01a577d880e6e2c82940b63c05516c4841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-samin-doc"

RDEPENDS:${PN} += ""

inherit rpm
