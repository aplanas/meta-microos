SUMMARY = "Binary files of cyrillic-bin"
DESCRIPTION = "Binary files of cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-cyrillic-bin-bin-2023.20230311.svn53554-92.1.aarch64.rpm"
RPM_HASH = "4247e3f933b946d73d449bcc3b4b17536009842edb9d6027fd34caaef378cc60b513f282fefe6738c82f450d677526877caf20d9b1f34badd1233221fd879435"

RPROVIDES:${PN} += "texlive-cyrillic-bin-bin"

RDEPENDS:${PN} += "texlive-cyrillic-bin"

inherit rpm
