SUMMARY = "Binary files of ctanbib"
DESCRIPTION = "Binary files of ctanbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48478"

RPM_NAME = "texlive-ctanbib-bin-2023.20230311.svn48478-93.1.aarch64.rpm"
RPM_HASH = "cff05cc2c50116f5053ba35cea5270750c9397aede55fa2091a4f21e8b95e80de8132622fe91a146295eca2d55ad7f5f04e887dbfcb16f5728106f077b756b6a"

RPROVIDES:${PN} += "texlive-ctanbib-bin"

RDEPENDS:${PN} += "texlive-ctanbib"

inherit rpm
