SUMMARY = "Binary files of platex"
DESCRIPTION = "Binary files of platex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66079"

RPM_NAME = "texlive-platex-bin-2023.20230311.svn66079-91.1.aarch64.rpm"
RPM_HASH = "6d1aaf62f581010cf090865e775c99d0776eaf66bd8e65473f83fe7aa2b71cc97cced81ab3181ffb71bd830f39fdf7fc2e58ad6b9660e5d5560a56cfd86132bb"

RPROVIDES:${PN} += "texlive-platex-bin"

RDEPENDS:${PN} += "texlive-platex"

inherit rpm
