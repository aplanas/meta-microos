SUMMARY = "Documentation for texlive-topfloat"
DESCRIPTION = "This package includes the documentation for texlive-topfloat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn19084"

RPM_NAME = "texlive-topfloat-doc-2023.201.svn19084-52.1.noarch.rpm"
RPM_HASH = "59767346ecc7881fc01a65b4e4dd864af3c954bb92a3a2cb042768835f3443602553a81fde272b2a43c809ccc137ed10c02717552b77db7077de0486b5854533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-topfloat-doc-it \
texlive-topfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
