SUMMARY = "Binary files of ulqda"
DESCRIPTION = "Binary files of ulqda"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-ulqda-bin-2023.20230311.svn13663-93.2.aarch64.rpm"
RPM_HASH = "3b5ffab0058553943d252fcd96b721fcd0c54c522bba14321d5b43fcecae2a74064cd931abc84ebb5293033d19d2ca5f8a24e4d69c8640956c1d88b586cd9928"

RPROVIDES:${PN} += "texlive-ulqda-bin"

RDEPENDS:${PN} += "texlive-ulqda"

inherit rpm
