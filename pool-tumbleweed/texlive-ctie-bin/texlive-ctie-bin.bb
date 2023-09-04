SUMMARY = "Binary files of ctie"
DESCRIPTION = "Binary files of ctie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ctie-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "dcf9280b6c3fbf7df4a19e17b4b8b5b12b10e20fbc1d7d9025c4642cbeb4b3ba1cf98adec38f9eef2ebcb9b430d95049a8dda7c993d59df247ab731987dd6c15"

RPROVIDES:${PN} += "texlive-ctie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-ctie"

inherit rpm
