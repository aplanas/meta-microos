SUMMARY = "Binary files of bibexport"
DESCRIPTION = "Binary files of bibexport"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16219"

RPM_NAME = "texlive-bibexport-bin-2023.20230311.svn16219-91.1.aarch64.rpm"
RPM_HASH = "6209beb539ab546edfe1249c1b57ebde1a25f57d58c0e156837db834db62cc02b417e5e91d8f18e48febc1f0a31612fe101e3b16875d2dd79d0c6fd797fb0358"

RPROVIDES:${PN} += "texlive-bibexport-bin"

RDEPENDS:${PN} += "texlive-bibexport"

inherit rpm
