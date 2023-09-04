SUMMARY = "Binary files of yplan"
DESCRIPTION = "Binary files of yplan"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34398"

RPM_NAME = "texlive-yplan-bin-2023.20230311.svn34398-93.2.aarch64.rpm"
RPM_HASH = "7e1d0743640ec52997e19e07eb08a3730909e2e9956a2dff243cf8cae93c957ef94a9eb444e4c57336908689d8080ad6a1234d71490a309009eb88dc5cc29f21"

RPROVIDES:${PN} += "texlive-yplan-bin"

RDEPENDS:${PN} += "texlive-yplan"

inherit rpm
