SUMMARY = "Binary files of pdftex-quiet"
DESCRIPTION = "Binary files of pdftex-quiet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49140"

RPM_NAME = "texlive-pdftex-quiet-bin-2023.20230311.svn49140-93.2.aarch64.rpm"
RPM_HASH = "6aec34d0c961cb470034e43665d0224153e67db065a3efd596b7cd6943293467202465d5c54ab1b788a87c6a83e5b0165f4de943c004772cfd5732d7a10b014c"

RPROVIDES:${PN} += "texlive-pdftex-quiet-bin"

RDEPENDS:${PN} += "texlive-pdftex-quiet"

inherit rpm
