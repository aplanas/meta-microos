SUMMARY = "Documentation for texlive-frimurer"
DESCRIPTION = "This package includes the documentation for texlive-frimurer"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn56704"

RPM_NAME = "texlive-frimurer-doc-2023.209.1svn56704-53.1.noarch.rpm"
RPM_HASH = "86e2d432248da40f3131180233487e571c78e15624133fbaa51d5dee269f374696f12136eee2784ef547701c70648ad659162cd30b33dd49bf571fe830fab2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frimurer-doc"

RDEPENDS:${PN} += ""

inherit rpm
