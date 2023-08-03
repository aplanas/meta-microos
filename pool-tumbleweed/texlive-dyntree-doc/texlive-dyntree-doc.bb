SUMMARY = "Documentation for texlive-dyntree"
DESCRIPTION = "This package includes the documentation for texlive-dyntree"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-dyntree-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "260966136d6d2a54c26e472d9aa32d520c7895dd4e756199b7312a9f6052117fd78d8da39203850dfbce126a54e3f43eebf39caffd3189b7ef94a4c191169953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dyntree-doc"

RDEPENDS:${PN} += ""

inherit rpm
