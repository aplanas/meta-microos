SUMMARY = "Documentation for texlive-alfaslabone"
DESCRIPTION = "This package includes the documentation for texlive-alfaslabone"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57452"

RPM_NAME = "texlive-alfaslabone-doc-2023.209.0.0.0.1svn57452-55.1.noarch.rpm"
RPM_HASH = "0ef6390384156cc457b6e15f8e61111c27691273cc95996585668bc2a3aeecb88ff6edb16293672de45c362b12430e8c356f573c08cf4607b1cb507a76cafde1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alfaslabone-doc"

RDEPENDS:${PN} += ""

inherit rpm
