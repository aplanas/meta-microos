SUMMARY = "Binary files of tex4ht"
DESCRIPTION = "Binary files of tex4ht"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-tex4ht-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "e7c461e2e142d86e26f8bba8d0c20070a02737cff0c9e9343435ff894425bcacf774f7fe2775dde8a2add6e0b42dba0e7b2d17a4899240f4d3555fb3dd79d538"

RPROVIDES:${PN} += "texlive-tex4ht-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-tex4ht"

inherit rpm
