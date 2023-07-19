SUMMARY = "Binary files of ltximg"
DESCRIPTION = "Binary files of ltximg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32346"

RPM_NAME = "texlive-ltximg-bin-2023.20230311.svn32346-93.1.aarch64.rpm"
RPM_HASH = "f7989f3a4b743b28824d76b171e873ec454781a018db005930677b8fc5d53ce635e9fbc1c1baeef4f2921bd824397b9049449bda3390c376b7013d5cf4136d81"

RPROVIDES:${PN} += "texlive-ltximg-bin"

RDEPENDS:${PN} += "texlive-ltximg"

inherit rpm
