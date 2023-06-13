SUMMARY = "Binary files of ctanupload"
DESCRIPTION = "Binary files of ctanupload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23866"

RPM_NAME = "texlive-ctanupload-bin-2023.20230311.svn23866-91.1.aarch64.rpm"
RPM_HASH = "f8a1d502b9d2fb123a72138e53beecbd148d2b0c8a325bd427a4ab0d5c6ee5c09a42992b52eddcde32b00d3fe0e23b9f17c7719876d1a6cacb62478f079ccf1f"

RPROVIDES:${PN} += "texlive-ctanupload-bin \
texlive-ctanupload-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-ctanupload"

inherit rpm
