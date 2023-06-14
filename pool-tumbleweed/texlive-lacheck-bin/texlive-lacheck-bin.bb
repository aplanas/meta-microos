SUMMARY = "Binary files of lacheck"
DESCRIPTION = "Binary files of lacheck"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-lacheck-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "e9354e2d91a6944fa0ba702ecd711ad665384981d5d77b0aaaf807e65c694a0cd37c58b86c8aa71ff72a9054c3a00c4a8191c7e381632b39fe1c68a0e3c83c01"

RPROVIDES:${PN} += "texlive-lacheck-bin"

RDEPENDS:${PN} += "libc.so.6 \
texlive-lacheck"

inherit rpm
