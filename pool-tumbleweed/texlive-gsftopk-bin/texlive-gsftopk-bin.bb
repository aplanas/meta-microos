SUMMARY = "Binary files of gsftopk"
DESCRIPTION = "Binary files of gsftopk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gsftopk-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "ddd3f14f369d250b5573422e55aec4fb9177920da4ac5bad59d7f93470c7261a3f720b9f2f49f0d1eeb85abbaad9343241013501c0b16b5c8d388b76af02b7ab"

RPROVIDES:${PN} += "texlive-gsftopk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-gsftopk"

inherit rpm
