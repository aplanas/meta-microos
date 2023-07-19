SUMMARY = "Binary files of latex2nemeth"
DESCRIPTION = "Binary files of latex2nemeth"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42300"

RPM_NAME = "texlive-latex2nemeth-bin-2023.20230311.svn42300-93.1.aarch64.rpm"
RPM_HASH = "451cd078d358799d755e608f31944532a6e16ddbd457a6051fb58acc8fbc23453ff3b182ae6d7bd3ac3a4aa0f0dd1edf760a2acac9965a65180048531a87927c"

RPROVIDES:${PN} += "texlive-latex2nemeth-bin"

RDEPENDS:${PN} += "texlive-latex2nemeth"

inherit rpm
