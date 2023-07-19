SUMMARY = "Binary files of dvipos"
DESCRIPTION = "Binary files of dvipos"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-dvipos-bin-2023.20230311.svn62210-93.1.aarch64.rpm"
RPM_HASH = "1b114e71372bac1273b3b8a440c27cec5c10fd6eecb0ce918eb9a404d5d912625f9acbfaddab77d9c5fbdb0eb6b4da64db2e34d27a6a65dd4eefc5560198c9df"

RPROVIDES:${PN} += "texlive-dvipos-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dvipos"

inherit rpm
