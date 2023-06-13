SUMMARY = "Binary files of makedtx"
DESCRIPTION = "Binary files of makedtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38769"

RPM_NAME = "texlive-makedtx-bin-2023.20230311.svn38769-91.1.aarch64.rpm"
RPM_HASH = "2d9c2b957e0091b4e6de82cad158c63dfa7bea585c42ca1d1f6adb089b5fe989dcc79c6492c5250a96df360aeb58b01480e139c68e7769471889f414518d4ce5"

RPROVIDES:${PN} += "texlive-makedtx-bin \
texlive-makedtx-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-makedtx"

inherit rpm
