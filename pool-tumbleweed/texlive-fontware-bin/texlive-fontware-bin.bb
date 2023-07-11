SUMMARY = "Binary files of fontware"
DESCRIPTION = "Binary files of fontware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-fontware-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "0ebb57f963b053c179b460ab0b616785825070c8e260f443761b40482fd502e089b903841b5e511946307f60e8653b2426b6963a88dfa922d55ed1620c7c59e1"

RPROVIDES:${PN} += "texlive-fontware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-fontware"

inherit rpm
