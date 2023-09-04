SUMMARY = "Documentation for texlive-qrcode"
DESCRIPTION = "This package includes the documentation for texlive-qrcode"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.51svn36065"

RPM_NAME = "texlive-qrcode-doc-2023.209.1.51svn36065-54.2.noarch.rpm"
RPM_HASH = "f9044116453a2605c293dcc57635c50f280f5ee0745abcea17979d7091e6592093805f8a5a60d526d1adc8e12558422e046bb4079b0bd8665b95e3bb31644ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
