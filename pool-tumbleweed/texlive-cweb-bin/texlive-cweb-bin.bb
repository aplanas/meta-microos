SUMMARY = "Binary files of cweb"
DESCRIPTION = "Binary files of cweb"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cweb-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "fcf473af7c492d4df1f64b1b4a77d602b4e323a4a4fa706fe44bcbf82bc23c07e84d30bce0444e45b5f2b8156ce19ecd1cbbcae6e6773bc1db5ab0e1d876db51"

RPROVIDES:${PN} += "texlive-cweb-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-cweb"

inherit rpm
