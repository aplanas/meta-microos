SUMMARY = "Binary files of yplan"
DESCRIPTION = "Binary files of yplan"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34398"

RPM_NAME = "texlive-yplan-bin-2023.20230311.svn34398-92.1.aarch64.rpm"
RPM_HASH = "8dd47f6019c2958b40f806d3ad230f7862bbd61add77c749dec70701d3baac971b04c29d593cdb53d561fc0b0696112c4084fb0c62bf4d3e14ab8bbf8453eca5"

RPROVIDES:${PN} += "texlive-yplan-bin"

RDEPENDS:${PN} += "texlive-yplan"

inherit rpm
