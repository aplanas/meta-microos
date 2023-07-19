SUMMARY = "Binary files of axodraw2"
DESCRIPTION = "Binary files of axodraw2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-axodraw2-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "c4f0b440902737c83457c7312596fee49601fc2603dbfeef3c3f8daf08870c4b74632b781af08df2af2307cd500f9278cd34304f9edd8edef994be5f5b69c4f2"

RPROVIDES:${PN} += "texlive-axodraw2-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-axodraw2"

inherit rpm
