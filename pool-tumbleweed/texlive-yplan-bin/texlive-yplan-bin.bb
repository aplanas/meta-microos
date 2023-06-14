SUMMARY = "Binary files of yplan"
DESCRIPTION = "Binary files of yplan"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34398"

RPM_NAME = "texlive-yplan-bin-2023.20230311.svn34398-91.1.aarch64.rpm"
RPM_HASH = "309eea190cc05d7c72c073cd655ce9cedace33860edd2e184fd16e33745cf9a9dec804ee3795a544f9fcf4ab821354520ab56b9f4ac52c601c4fd412765069c7"

RPROVIDES:${PN} += "texlive-yplan-bin"

RDEPENDS:${PN} += "texlive-yplan"

inherit rpm
