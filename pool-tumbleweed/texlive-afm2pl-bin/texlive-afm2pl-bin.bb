SUMMARY = "Binary files of afm2pl"
DESCRIPTION = "Binary files of afm2pl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-afm2pl-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "4ca4dd7597d006d60f929ef401edbbf0183379ad931b6992d8c7e4f0b4472df316995538ee09a4d1724a5c6307f35ccf1a3d87d991ce4eb0cacf81c5bc56eb95"

RPROVIDES:${PN} += "texlive-afm2pl-bin \
texlive-afm2pl-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
texlive-afm2pl"

inherit rpm
