SUMMARY = "Documentation files for python bindings libcomps library"
DESCRIPTION = "Documentation files for python bindings libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "python-libcomps-doc-0.1.19-2.3.noarch.rpm"
RPM_HASH = "322e64718e51836f5a3f616deb1c3541f6a61674127834025d21050b5d05b678506ef970a84d97e7361ad6fea734cd24a9a7cb2b092144f59c5b4a8cdb9a8455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-libcomps-doc"

RDEPENDS:${PN} += ""

inherit rpm
