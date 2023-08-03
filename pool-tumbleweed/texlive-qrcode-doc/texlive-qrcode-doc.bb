SUMMARY = "Documentation for texlive-qrcode"
DESCRIPTION = "This package includes the documentation for texlive-qrcode"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.51svn36065"

RPM_NAME = "texlive-qrcode-doc-2023.209.1.51svn36065-54.1.noarch.rpm"
RPM_HASH = "c0f275c640706f493781811b5041a18f607b9c8679a2be85ee51f97740f26ca9f1bfe4092cbb6d2dfffd6f75e3de07501dd736ed3964b63b1422320333d12bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
