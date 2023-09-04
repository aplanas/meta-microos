SUMMARY = "Binary files of gregoriotex"
DESCRIPTION = "Binary files of gregoriotex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-gregoriotex-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "821cf35f7ecc60256f12f403d7cb496b7732ee3ec623000da22486902601888adc538629620846ae1e924e0df5af498e828d3eb978a83dd2b691c0e4761e0797"

RPROVIDES:${PN} += "texlive-gregoriotex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-gregoriotex"

inherit rpm
