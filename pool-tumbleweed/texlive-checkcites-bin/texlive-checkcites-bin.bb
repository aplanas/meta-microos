SUMMARY = "Binary files of checkcites"
DESCRIPTION = "Binary files of checkcites"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25623"

RPM_NAME = "texlive-checkcites-bin-2023.20230311.svn25623-93.2.aarch64.rpm"
RPM_HASH = "c72043b07d8b82a4a9abaa999f23eceb585552adf71ddf2b64e3cf3cdddb8aa3f5bbf62e4472a6cace337d9ee31b3ecce33dadb45d401fc96a155dab32e08e0a"

RPROVIDES:${PN} += "texlive-checkcites-bin"

RDEPENDS:${PN} += "texlive-checkcites"

inherit rpm
