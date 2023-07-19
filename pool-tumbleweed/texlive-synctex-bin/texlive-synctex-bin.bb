SUMMARY = "Binary files of synctex"
DESCRIPTION = "Binary files of synctex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-synctex-bin-2023.20230311.svn66084-93.1.aarch64.rpm"
RPM_HASH = "f33c7ec176141a7e1131d19d5473c56d69893a5aac3100b2624b7ab7cb4491cfcd498b0b05105baa2931464381b944d558f5b205dbc07a47b13b4f95d85cd2ee"

RPROVIDES:${PN} += "texlive-synctex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsynctex.so.2 \
texlive-synctex"

inherit rpm
