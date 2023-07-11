SUMMARY = "Binary files of bib2gls"
DESCRIPTION = "Binary files of bib2gls"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45266"

RPM_NAME = "texlive-bib2gls-bin-2023.20230311.svn45266-92.1.aarch64.rpm"
RPM_HASH = "95b60123567f4d80205499968de1dc7c187bf1ea863b545205c72f4b67284a7bfc92e23e9237a957947c8a6bb4c579313a35c00a54c28e448551e8d278830fe4"

RPROVIDES:${PN} += "texlive-bib2gls-bin"

RDEPENDS:${PN} += "texlive-bib2gls"

inherit rpm
