SUMMARY = "Documentation for texlive-inconsolata"
DESCRIPTION = "This package includes the documentation for texlive-inconsolata"
LICENSE = "OFL-1.1"

PV = "2023.201.1.121svn54512"

RPM_NAME = "texlive-inconsolata-doc-2023.201.1.121svn54512-52.1.noarch.rpm"
RPM_HASH = "9ba2245ea4c9b62447686dd646445c1297fdfe293082a5f41c7899c8d50f32f792706e4477e89aaab5c2cb33978392d447a3912bc548041d456263a786376d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inconsolata-doc"

RDEPENDS:${PN} += ""

inherit rpm
