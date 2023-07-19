SUMMARY = "Binary files of fontinst"
DESCRIPTION = "Binary files of fontinst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-fontinst-bin-2023.20230311.svn53554-93.1.aarch64.rpm"
RPM_HASH = "79bf1f517e5f13e573ed274e8a1f9825982304faa3f74b0f4c1035fa1220558c0e7956b478a261a89556833db0240decd03b07676fed50af32e2e2b29323b27e"

RPROVIDES:${PN} += "texlive-fontinst-bin"

RDEPENDS:${PN} += "texlive-fontinst"

inherit rpm
