SUMMARY = "Binary files of xml2pmx"
DESCRIPTION = "Binary files of xml2pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xml2pmx-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "6e5211b45df98712decef2626aa0bb2c80112009137a70897bb05bda63f7c4c686b360fe6b4148dd298b549c32f668c75bfb6588a1a5af92ac043b37ae5968ef"

RPROVIDES:${PN} += "texlive-xml2pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-xml2pmx"

inherit rpm
