SUMMARY = "Binary files of pdfbook2"
DESCRIPTION = "Binary files of pdfbook2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37537"

RPM_NAME = "texlive-pdfbook2-bin-2023.20230311.svn37537-93.2.aarch64.rpm"
RPM_HASH = "2a26548a352bac5b43cb1240c55172f975d2157b7ef7f764d0f06bf07f6653c42a879cc75ddec4fda558f36d70f2ce951ae952eebfffbaed589765fba6f9b755"

RPROVIDES:${PN} += "texlive-pdfbook2-bin"

RDEPENDS:${PN} += "texlive-pdfbook2"

inherit rpm
