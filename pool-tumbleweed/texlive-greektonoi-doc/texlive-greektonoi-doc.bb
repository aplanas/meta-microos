SUMMARY = "Documentation for texlive-greektonoi"
DESCRIPTION = "This package includes the documentation for texlive-greektonoi"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.svn39419"

RPM_NAME = "texlive-greektonoi-doc-2023.209.svn39419-54.1.noarch.rpm"
RPM_HASH = "9d2b274ed793ae001bb88986f311c6edaebe9bd89b85693018489ecf328ce525921e4403f2708f31bbc230c0b20ed52f8d3199b9c1c6355d0a497e590cdb6b3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektonoi-doc-el \
texlive-greektonoi-doc"

RDEPENDS:${PN} += ""

inherit rpm
