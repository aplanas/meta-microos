SUMMARY = "Documentation for texlive-businesscard-qrcode"
DESCRIPTION = "This package includes the documentation for texlive-businesscard-qrcode"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.2svn61719"

RPM_NAME = "texlive-businesscard-qrcode-doc-2023.201.1.2svn61719-52.1.noarch.rpm"
RPM_HASH = "525cd2b747031129b4deb27d27755204b6ef4a812e8ef9bc391b186527b9bd608ca35504c8cfbcb300f7d5e70d3853ba73f3c3f983a77a5d44472e1927c14063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-businesscard-qrcode-doc"
RDEPENDS:${PN} += ""

inherit rpm
