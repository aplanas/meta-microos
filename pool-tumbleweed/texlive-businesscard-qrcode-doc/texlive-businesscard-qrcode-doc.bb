SUMMARY = "Documentation for texlive-businesscard-qrcode"
DESCRIPTION = "This package includes the documentation for texlive-businesscard-qrcode"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.2svn61719"

RPM_NAME = "texlive-businesscard-qrcode-doc-2023.209.1.2svn61719-53.1.noarch.rpm"
RPM_HASH = "bedf2fc020bbdcaef5e1642c45619a6b7206e7bb98d309faddb1be69fc41f76ac2399f285353ae52d43dd9af379207ea40c760637e64e7bb02471a64c2962371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-businesscard-qrcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
