SUMMARY = "Binary files of pdftosrc"
DESCRIPTION = "Binary files of pdftosrc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pdftosrc-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "d1d584424cd2cd9e70dba065831627ba2a2923fe63065255f95a277f1fb0e3ef6f355219af1d30798b732c904cd5757899d249ce189cf855b9e5da1cd52066cd"

RPROVIDES:${PN} += "texlive-pdftools-bin-/usr/bin/pdftosrc \
texlive-pdftosrc-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-pdftosrc"

inherit rpm
