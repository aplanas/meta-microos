SUMMARY = "Documentation for texlive-luatexko"
DESCRIPTION = "This package includes the documentation for texlive-luatexko"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5svn64893"

RPM_NAME = "texlive-luatexko-doc-2023.201.3.5svn64893-52.1.noarch.rpm"
RPM_HASH = "a334ab18c0ab9a705b52e41f8733c09f1276d80fda490cd69f4011c16257cb752b11ad976bc602c7e1cdba901ca2b148e2a374b24d7f22f10046206b5ecb5fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatexko-doc"

RDEPENDS:${PN} += ""

inherit rpm
