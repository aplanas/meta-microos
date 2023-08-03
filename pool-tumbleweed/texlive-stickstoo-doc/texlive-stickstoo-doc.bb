SUMMARY = "Documentation for texlive-stickstoo"
DESCRIPTION = "This package includes the documentation for texlive-stickstoo"
LICENSE = "OFL-1.1"

PV = "2023.209.1.035svn60793"

RPM_NAME = "texlive-stickstoo-doc-2023.209.1.035svn60793-58.1.noarch.rpm"
RPM_HASH = "b181b00266d35509035f3211078488f1a0be527f427fad5d33ece86fcaea8554b3a059ddbe3afaad4acfe713bfa3939fbea8c4688578d38ffb02635e50eedda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stickstoo-doc"

RDEPENDS:${PN} += ""

inherit rpm
