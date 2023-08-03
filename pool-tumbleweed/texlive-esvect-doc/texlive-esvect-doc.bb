SUMMARY = "Documentation for texlive-esvect"
DESCRIPTION = "This package includes the documentation for texlive-esvect"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn32098"

RPM_NAME = "texlive-esvect-doc-2023.209.1.3svn32098-53.1.noarch.rpm"
RPM_HASH = "fa2452ac3ba234452d1b1ab942d85ec53286d70ba2daea6067b7b7ee809db881dc2303f53c2f85ea1a3ae05a1fc2d3c724f53fb446523897d1f6c1a90210651f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esvect-doc"

RDEPENDS:${PN} += ""

inherit rpm
