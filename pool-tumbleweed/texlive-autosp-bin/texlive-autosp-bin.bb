SUMMARY = "Binary files of autosp"
DESCRIPTION = "Binary files of autosp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-autosp-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "a3487e8ec586435040af48b2b9416dfd00d6a16e297effac868b3a146383da512b506468486fbf21b2838155fcc9c755bb27532de73c6f4601f7b113dcf595d2"

RPROVIDES:${PN} += "texlive-autosp-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-autosp"

inherit rpm
