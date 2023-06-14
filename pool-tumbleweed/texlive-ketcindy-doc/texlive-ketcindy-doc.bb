SUMMARY = "Documentation for texlive-ketcindy"
DESCRIPTION = "This package includes the documentation for texlive-ketcindy"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.20191225.0svn58661"

RPM_NAME = "texlive-ketcindy-doc-2023.201.20191225.0svn58661-55.1.noarch.rpm"
RPM_HASH = "c33335c4792641b29417871570df2c832c75a7b8d7b0531b1e5e0e5d3a3751628fa3fbaaff578023611234e182147ec942afc0c35f9d0bbfe6f7229b6ab3297c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ketcindy-doc-ja \
texlive-ketcindy-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
