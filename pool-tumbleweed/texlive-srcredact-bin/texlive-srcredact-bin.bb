SUMMARY = "Binary files of srcredact"
DESCRIPTION = "Binary files of srcredact"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38710"

RPM_NAME = "texlive-srcredact-bin-2023.20230311.svn38710-93.1.aarch64.rpm"
RPM_HASH = "894fedf71353e6476b11879d7cb95dc9d049321a20a7a1893e67a828aa727b7639a9da2ae2be1b0b62922c21e83c50eb45e5430e3a4dfd2988d32e83b5b3281d"

RPROVIDES:${PN} += "texlive-srcredact-bin"

RDEPENDS:${PN} += "texlive-srcredact"

inherit rpm
