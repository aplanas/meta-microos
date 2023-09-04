SUMMARY = "Binary files of bib2gls"
DESCRIPTION = "Binary files of bib2gls"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45266"

RPM_NAME = "texlive-bib2gls-bin-2023.20230311.svn45266-93.2.aarch64.rpm"
RPM_HASH = "75435b092f19118d7f5443f07834d96b22d229dd2d8f90cf78aad6ec9e06ad0f645bead15318b8fb4540dbe7c63efd5696504262d3527a6a5a7fb5466ae82b5f"

RPROVIDES:${PN} += "texlive-bib2gls-bin"

RDEPENDS:${PN} += "texlive-bib2gls"

inherit rpm
