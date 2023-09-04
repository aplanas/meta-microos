SUMMARY = "Documentation for texlive-eplain"
DESCRIPTION = "This package includes the documentation for texlive-eplain"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.13svn64721"

RPM_NAME = "texlive-eplain-doc-2023.209.3.13svn64721-54.2.noarch.rpm"
RPM_HASH = "4185ecd9ef19ab9d96a6b533f0a678a21d7f9ca4d7b4c6d41ac2ff1063a4cf4a7b76a0a73e40dc37feb7f38279169b696cb0ef59067ca15bb2a011e1a8e61c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-eplain.1 \
texlive-eplain-doc"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/sh"

inherit rpm
