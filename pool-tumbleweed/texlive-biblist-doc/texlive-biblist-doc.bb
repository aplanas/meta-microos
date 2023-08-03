SUMMARY = "Documentation for texlive-biblist"
DESCRIPTION = "This package includes the documentation for texlive-biblist"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn17116"

RPM_NAME = "texlive-biblist-doc-2023.209.svn17116-54.1.noarch.rpm"
RPM_HASH = "2e8aaf6afd2503fcda0705ffc06cc4919627adec75fc8854299ab35bbb0006b65d4aebbca8e2b88003af3371c4bec4b8de25e3aabfeca9f2fc7cf98531a53982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblist-doc"

RDEPENDS:${PN} += ""

inherit rpm
