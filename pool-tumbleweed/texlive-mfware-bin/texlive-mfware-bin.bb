SUMMARY = "Binary files of mfware"
DESCRIPTION = "Binary files of mfware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mfware-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "e5209a2bc4e1a5b37e3455f83b35bdabecb7273bf891364ca40e36dca3bbf9883350b8366fe7ce7edb0e5a7730579e63b49d2fbe889d6244473bebbe9a853e55"

RPROVIDES:${PN} += "texlive-mfware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-mfware"

inherit rpm
