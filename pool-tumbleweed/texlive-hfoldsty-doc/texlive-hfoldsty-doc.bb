SUMMARY = "Documentation for texlive-hfoldsty"
DESCRIPTION = "This package includes the documentation for texlive-hfoldsty"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.15svn29349"

RPM_NAME = "texlive-hfoldsty-doc-2023.209.1.15svn29349-54.1.noarch.rpm"
RPM_HASH = "ffa5037c1df5f79dbce5a1888ad87a66afa1e300b2bb13cb0cf4fb61a2fcc58f426bd8ca68d81352377809aa66d28d9168738e1bab1f2b356633838cb42cff91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfoldsty-doc"

RDEPENDS:${PN} += ""

inherit rpm
