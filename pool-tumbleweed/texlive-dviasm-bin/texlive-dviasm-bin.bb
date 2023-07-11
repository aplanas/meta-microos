SUMMARY = "Binary files of dviasm"
DESCRIPTION = "Binary files of dviasm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn8329"

RPM_NAME = "texlive-dviasm-bin-2023.20230311.svn8329-92.1.aarch64.rpm"
RPM_HASH = "8d30bfdaa01e8b352687458142c0095513de8e580f859022c6e88d5827b97a5388b8bf0e2692321fda4b982c2ad859b1c7f793158775286d32f17f4dfc064dd0"

RPROVIDES:${PN} += "texlive-dviasm-bin"

RDEPENDS:${PN} += "texlive-dviasm"

inherit rpm
