SUMMARY = "Binary files of dvicopy"
DESCRIPTION = "Binary files of dvicopy"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvicopy-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "93a171a08b687719163abec2deb5e1b038ae332c270836c41498477c522b2e828201fcb50860daf20328bf86f8c632d6a8a0fa76c5694f35102e92d9182a0653"

RPROVIDES:${PN} += "texlive-dvicopy-bin \
texlive-dvicopy-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkpathsea.so.6()(64bit) \
texlive-dvicopy"

inherit rpm
