SUMMARY = "Documentation for texlive-altfont"
DESCRIPTION = "This package includes the documentation for texlive-altfont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-altfont-doc-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "ec64c4fd01d20565f810a57ff02114d6b6a8140d9d360adf1000d0177026c6d95170d9282eef0762e428df4cd9cf63931501cf43860582d0732a8bfcb9c0eee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-altfont-doc"
RDEPENDS:${PN} += ""

inherit rpm
