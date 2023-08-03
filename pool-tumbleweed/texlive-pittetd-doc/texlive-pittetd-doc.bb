SUMMARY = "Documentation for texlive-pittetd"
DESCRIPTION = "This package includes the documentation for texlive-pittetd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.618svn15878"

RPM_NAME = "texlive-pittetd-doc-2023.209.1.618svn15878-52.1.noarch.rpm"
RPM_HASH = "68a8177e16907bd79f408c0956989ebd6ed08407dd93c89339b04085980e1740e5ae9a6df0b5db111a5e60c62211d2405291a02383971e95fe29049decb0200b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pittetd-doc"

RDEPENDS:${PN} += ""

inherit rpm
