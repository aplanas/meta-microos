SUMMARY = "Binary files of platex"
DESCRIPTION = "Binary files of platex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66079"

RPM_NAME = "texlive-platex-bin-2023.20230311.svn66079-92.1.aarch64.rpm"
RPM_HASH = "7ce3d35d41fcc1c5692937a5d2db93fb425bc46dd078bc2f1915e35e0526e65a7854b4bae067ee357ceb3a1c6fb3c9c85a09a6c38feb775b936ef2135f00070c"

RPROVIDES:${PN} += "texlive-platex-bin"

RDEPENDS:${PN} += "texlive-platex"

inherit rpm
