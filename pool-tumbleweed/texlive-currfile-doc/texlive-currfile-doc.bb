SUMMARY = "Documentation for texlive-currfile"
DESCRIPTION = "This package includes the documentation for texlive-currfile"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.8svn64673"

RPM_NAME = "texlive-currfile-doc-2023.204.0.0.8svn64673-54.1.noarch.rpm"
RPM_HASH = "d806d2a8f96d2cd094577bd67fcc0f6e424955e42755a8364043e73aad467be055a2d7933a701a8df778c90504e36018e55cafd75d1d35b8974615683479e079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
