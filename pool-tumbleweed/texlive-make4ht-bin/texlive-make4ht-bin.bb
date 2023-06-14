SUMMARY = "Binary files of make4ht"
DESCRIPTION = "Binary files of make4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37750"

RPM_NAME = "texlive-make4ht-bin-2023.20230311.svn37750-91.1.aarch64.rpm"
RPM_HASH = "ebb819545c3edaefea829c4a0b0a1e758b2914b5a9f5a4c98929492b5d9d85781c7cace2311a1c56a5a18e15d25e065679eb6d8ff1887bb188bf8f75fdfa3b30"

RPROVIDES:${PN} += "texlive-make4ht-bin"

RDEPENDS:${PN} += "texlive-make4ht"

inherit rpm
