SUMMARY = "Binary files of mkpic"
DESCRIPTION = "Binary files of mkpic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33688"

RPM_NAME = "texlive-mkpic-bin-2023.20230311.svn33688-91.1.aarch64.rpm"
RPM_HASH = "e2b947ae9d0413f669fcea4cad8c363942447eb15b9c6ec47baba3928eb4a542c6fa84c5308a095f46b054394e418d49859e986e835d0f306a7e1ac3f5a18388"

RPROVIDES:${PN} += "texlive-mkpic-bin"

RDEPENDS:${PN} += "texlive-mkpic"

inherit rpm
