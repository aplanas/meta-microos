SUMMARY = "Binary files of listbib"
DESCRIPTION = "Binary files of listbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn26126"

RPM_NAME = "texlive-listbib-bin-2023.20230311.svn26126-93.2.aarch64.rpm"
RPM_HASH = "40f4538f79f4175c699553060184740c2ed8cf98fa0b49134471116b087a1e749ce0e13018672f8ce356471a863056af68cebe563bb50e311bd1130aabebc6cd"

RPROVIDES:${PN} += "texlive-listbib-bin"

RDEPENDS:${PN} += "texlive-listbib"

inherit rpm
