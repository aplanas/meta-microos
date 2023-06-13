SUMMARY = "Documentation for texlive-urwchancal"
DESCRIPTION = "This package includes the documentation for texlive-urwchancal"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn21701"

RPM_NAME = "texlive-urwchancal-doc-2023.201.1svn21701-53.1.noarch.rpm"
RPM_HASH = "2dd465bcd6aac40c0defc259c974e15d6172a6457ede81552b56f139d74edb6dbd708eabf3a5239cd3716fdd102c32b804b1ee1e32ed62abf2a0c1f498823bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urwchancal-doc"

RDEPENDS:${PN} += ""

inherit rpm
