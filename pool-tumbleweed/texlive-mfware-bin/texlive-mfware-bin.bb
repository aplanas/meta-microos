SUMMARY = "Binary files of mfware"
DESCRIPTION = "Binary files of mfware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mfware-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "08549a8b9ec0a19988b200b30363c2cf60ddec99f2dfceebcdc4ca949bc91953dd2b7bab10738c9a4ef35915968f66d81e6a3f733a3fa3aa63f9eb8912b90d7e"

RPROVIDES:${PN} += "texlive-mfware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-mfware"

inherit rpm
