SUMMARY = "Binary files of lacheck"
DESCRIPTION = "Binary files of lacheck"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-lacheck-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "245ecdbb9ae3b0bfbf3a3ea081b56961fed95d54cac0823253cf1a9fcf35fa7f33fe93ffca63d3cd6928b05c0b3064173bc08549f9d20770993caf2f1c9bc3b8"

RPROVIDES:${PN} += "texlive-lacheck-bin"

RDEPENDS:${PN} += "libc.so.6 \
texlive-lacheck"

inherit rpm
