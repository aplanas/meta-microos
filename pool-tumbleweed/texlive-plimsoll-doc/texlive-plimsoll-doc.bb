SUMMARY = "Documentation for texlive-plimsoll"
DESCRIPTION = "This package includes the documentation for texlive-plimsoll"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn56605"

RPM_NAME = "texlive-plimsoll-doc-2023.209.1svn56605-53.1.noarch.rpm"
RPM_HASH = "9725c30c9426390bc1db1ca37b3d35f960a2c9025080c610195b4905e0a6d4f91da7128dc556671e17983c4e325173e32a3888ec6f987755073dda066c1ec750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plimsoll-doc"

RDEPENDS:${PN} += ""

inherit rpm
