SUMMARY = "Binary files of ctanbib"
DESCRIPTION = "Binary files of ctanbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48478"

RPM_NAME = "texlive-ctanbib-bin-2023.20230311.svn48478-93.2.aarch64.rpm"
RPM_HASH = "1546caec2b74f70c50dcfdc5146e36663a067f87799765778b3db4ddc2050cebdcbc866ded07b2a231829c584af128e4d2b43f9db545894546430e5d0353db55"

RPROVIDES:${PN} += "texlive-ctanbib-bin"

RDEPENDS:${PN} += "texlive-ctanbib"

inherit rpm
