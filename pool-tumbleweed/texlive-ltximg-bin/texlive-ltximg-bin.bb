SUMMARY = "Binary files of ltximg"
DESCRIPTION = "Binary files of ltximg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32346"

RPM_NAME = "texlive-ltximg-bin-2023.20230311.svn32346-93.2.aarch64.rpm"
RPM_HASH = "0b932b4ae18e5c1f1850dd436fab24bf18dd93769f9d98b9b5072ba84ed1eab4acfa2f8ab34186d1d57d95792190e56a96c72164c0514459030a72098234a8ac"

RPROVIDES:${PN} += "texlive-ltximg-bin"

RDEPENDS:${PN} += "texlive-ltximg"

inherit rpm
