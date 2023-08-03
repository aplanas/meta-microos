SUMMARY = "Documentation for texlive-knitting"
DESCRIPTION = "This package includes the documentation for texlive-knitting"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn50782"

RPM_NAME = "texlive-knitting-doc-2023.209.3.0svn50782-56.1.noarch.rpm"
RPM_HASH = "4e8d738a47fdb34516624ec0a8a148acbcd32ad609801a1907f82d1832abf93884378ff002ec900ba8f094b0e17662cb36690675883f09632c91e97e9e599283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knitting-doc"

RDEPENDS:${PN} += ""

inherit rpm
