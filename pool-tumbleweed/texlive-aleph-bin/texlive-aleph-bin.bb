SUMMARY = "Binary files of aleph"
DESCRIPTION = "Binary files of aleph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-aleph-bin-2023.20230311.svn66084-93.1.aarch64.rpm"
RPM_HASH = "5732bd9360662c68b415a1e37ef30c134cb9288093b7690868bc977c1a8a4136624a61056933e70ab0d8f5bf25bca7b0cd8395fb9ad4d4034654a585422cac41"

RPROVIDES:${PN} += "texlive-aleph-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-aleph"

inherit rpm
