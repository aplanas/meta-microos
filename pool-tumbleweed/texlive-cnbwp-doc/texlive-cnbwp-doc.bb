SUMMARY = "Documentation for texlive-cnbwp"
DESCRIPTION = "This package includes the documentation for texlive-cnbwp"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32550"

RPM_NAME = "texlive-cnbwp-doc-2023.209.svn32550-54.1.noarch.rpm"
RPM_HASH = "c5345db4f3487ec37eb043371ba24b3a9fca839c75c1dbf283dc9cedd61abf562e0054b7012b3cff1d68cb13321f2d9dcb8a28589e83ba8b00e7fa4146c78b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cnbwp-doc"

RDEPENDS:${PN} += ""

inherit rpm
