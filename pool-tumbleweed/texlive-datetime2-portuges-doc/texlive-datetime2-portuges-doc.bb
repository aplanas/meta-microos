SUMMARY = "Documentation for texlive-datetime2-portuges"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-portuges"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48457"

RPM_NAME = "texlive-datetime2-portuges-doc-2023.209.1.1svn48457-53.1.noarch.rpm"
RPM_HASH = "0135373f955a5f9fc0b0821a1ad7b532f6145f19aff57f167f0fe2ce4ff04d5d977ec4070f91d706b73c898b9e44b2dc28343ff486f66e9156bf41ad28613c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
