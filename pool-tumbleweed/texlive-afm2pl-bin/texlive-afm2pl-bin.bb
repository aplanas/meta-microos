SUMMARY = "Binary files of afm2pl"
DESCRIPTION = "Binary files of afm2pl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-afm2pl-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "aa1dd01d86d8a51727a85fe6648d3a5bc18b36dee13d26b35d90efc3726fa82131545f229d4f187544977a868b0900dbeb4103e15d7c518490f471a82ac354bf"

RPROVIDES:${PN} += "texlive-afm2pl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-afm2pl"

inherit rpm
