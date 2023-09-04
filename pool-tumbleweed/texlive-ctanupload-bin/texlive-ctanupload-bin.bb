SUMMARY = "Binary files of ctanupload"
DESCRIPTION = "Binary files of ctanupload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23866"

RPM_NAME = "texlive-ctanupload-bin-2023.20230311.svn23866-93.2.aarch64.rpm"
RPM_HASH = "736c9d2074ea58e2699916934fbd09cd07f68bef26293518dd5dddf23e1876adc4038a3098984a2e98db21b3c8416f25d44862a421d14d2116f82a938e6a8286"

RPROVIDES:${PN} += "texlive-ctanupload-bin"

RDEPENDS:${PN} += "texlive-ctanupload"

inherit rpm
