SUMMARY = "Documentation for texlive-cd-cover"
DESCRIPTION = "This package includes the documentation for texlive-cd-cover"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn17121"

RPM_NAME = "texlive-cd-cover-doc-2023.209.1.0svn17121-53.1.noarch.rpm"
RPM_HASH = "0f0444a4e6f145ccc844d21ddef25b57c809cda3c48be96d23e742503ba984e11402969e3b22740593264857af93d857f11629ace3c36a5bcb0b200e548dc557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cd-cover-doc"

RDEPENDS:${PN} += ""

inherit rpm
