SUMMARY = "Documentation for texlive-theanodidot"
DESCRIPTION = "This package includes the documentation for texlive-theanodidot"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64518"

RPM_NAME = "texlive-theanodidot-doc-2023.209.svn64518-55.1.noarch.rpm"
RPM_HASH = "f2d0f207562a576e4dc95ac79308e7675bd391e9a5c4aa3e48f8526c3ccdaf5e86d1c31424f68225324e7ad952c29f2bf47420b7d247b2caf402b706c1559fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanodidot-doc"

RDEPENDS:${PN} += ""

inherit rpm
