SUMMARY = "Binary files of typeoutfileinfo"
DESCRIPTION = "Binary files of typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25648"

RPM_NAME = "texlive-typeoutfileinfo-bin-2023.20230311.svn25648-91.1.aarch64.rpm"
RPM_HASH = "e2e25c1a683cc99eb736c88b75aacec6aa9c46903e0eff6f6a0f9a43ebd3830d428896c37ac06faa3162a45417864e47d559c987c5dc161f579531c3d5c11b31"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-bin"

RDEPENDS:${PN} += "texlive-typeoutfileinfo"

inherit rpm
