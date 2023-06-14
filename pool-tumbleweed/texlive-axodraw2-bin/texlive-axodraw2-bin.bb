SUMMARY = "Binary files of axodraw2"
DESCRIPTION = "Binary files of axodraw2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-axodraw2-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "1ccb71d829dc45939aa13ca53d86683f8e01732bb5a387f46aef1b719042f5ab8e2815b711f20a9e891367d29fbaf40b874bdee720397e5877f0f00cd51684ca"

RPROVIDES:${PN} += "texlive-axodraw2-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-axodraw2"

inherit rpm
