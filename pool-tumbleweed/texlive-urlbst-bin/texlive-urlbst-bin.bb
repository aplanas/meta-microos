SUMMARY = "Binary files of urlbst"
DESCRIPTION = "Binary files of urlbst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23262"

RPM_NAME = "texlive-urlbst-bin-2023.20230311.svn23262-93.2.aarch64.rpm"
RPM_HASH = "00dd42c31dd2937971c6225ce6785b24eeb43b570968a3a014d6d883db6a94d036ccd87df785da2c0e0032c800881c989d1f3ca1c57edc791c71100f1d872c80"

RPROVIDES:${PN} += "texlive-urlbst-bin"

RDEPENDS:${PN} += "texlive-urlbst"

inherit rpm
