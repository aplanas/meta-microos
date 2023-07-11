SUMMARY = "Binary files of pdfbook2"
DESCRIPTION = "Binary files of pdfbook2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37537"

RPM_NAME = "texlive-pdfbook2-bin-2023.20230311.svn37537-92.1.aarch64.rpm"
RPM_HASH = "55a7bf15635e40a887508af23adeb3330e9d3191faf139aca8781f215c36cfb0cce1482beabbf00bbd21b9d744159fe0c437234a785bdb74cf4feeadac6bca4b"

RPROVIDES:${PN} += "texlive-pdfbook2-bin"

RDEPENDS:${PN} += "texlive-pdfbook2"

inherit rpm
