SUMMARY = "Documentation for texlive-gnu-freefont"
DESCRIPTION = "This package includes the documentation for texlive-gnu-freefont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-gnu-freefont-doc-2023.209.svn29349-54.1.noarch.rpm"
RPM_HASH = "612e2f6fd1753cd29f787f0010fd112f17fef1750cce11de0d176ec16cc0952f75e3d2d4a37c96d9019dccd45fe91d4f150114979fc6a4706c4e8144d37d7070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
