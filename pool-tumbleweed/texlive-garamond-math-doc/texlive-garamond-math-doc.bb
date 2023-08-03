SUMMARY = "Documentation for texlive-garamond-math"
DESCRIPTION = "This package includes the documentation for texlive-garamond-math"
LICENSE = "OFL-1.1"

PV = "2023.209.svn61481"

RPM_NAME = "texlive-garamond-math-doc-2023.209.svn61481-53.1.noarch.rpm"
RPM_HASH = "86cc70148265c541dba81ef43140df498f6ff9d1440d7377435d5ca7ba32dee9a82d01bca236b17f942b22da90296696a4ae68cf2614a53f7a8dc454fbbc9a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
