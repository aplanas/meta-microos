SUMMARY = "Documentation for texlive-context-fancybreak"
DESCRIPTION = "This package includes the documentation for texlive-context-fancybreak"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-fancybreak-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "c240ad76704fbc67e0450968a0087ab581e0960d194cab89901b7cea80a8442001fe567dc831bdbe104b410c7fe06a68dd3676acc49e1c76695f25a994c26fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-fancybreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
