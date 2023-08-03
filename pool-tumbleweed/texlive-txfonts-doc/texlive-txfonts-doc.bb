SUMMARY = "Documentation for texlive-txfonts"
DESCRIPTION = "This package includes the documentation for texlive-txfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-txfonts-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "6af7bf633840841eb6a4e08440feeca5eda3e8666ac6f5bf133fb6018557e1e9516e8cae35104ccab205dd2dfed09165a1d6ebd6399fc91952e0b9635c21c550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
