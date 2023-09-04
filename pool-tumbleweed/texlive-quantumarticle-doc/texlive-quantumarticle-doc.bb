SUMMARY = "Documentation for texlive-quantumarticle"
DESCRIPTION = "This package includes the documentation for texlive-quantumarticle"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1svn65242"

RPM_NAME = "texlive-quantumarticle-doc-2023.209.6.1svn65242-54.2.noarch.rpm"
RPM_HASH = "ccf2e819ffe913f18644332033d96efd64e48750002768ac3dee7817c949718f0d3691d7b7413cd6be0c2d4dfb48f8079e8e79e22ea87ec6e124a96f546131d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantumarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
