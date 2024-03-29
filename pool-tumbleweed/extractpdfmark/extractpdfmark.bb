SUMMARY = "Helper for correctly compacting PDF files created by TeX"
DESCRIPTION = "This tool helps compacting PDF files generated by the TeX \
typesetting system by extracting meta data like page mode and named \
destinations (link targets) and saving them in a PDFmark file. The \
PDFmark file can then be used by ghostscript when processing the \
TeX-generated PDF to make sure that the final output contains correct \
page mode and link targets. Such post-processing of TeX-generated PDF \
output is often useful to reduce the size of the final PDF document, \
e.g. by removing duplicate font sets."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "extractpdfmark-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "cff392c30cec930cd06fe1c8e33b929a2b7c6396aaa6050c70bb762456ebbb37a56b0153a66eadfafd1bef5cac4bae8c002cb7f9d3ecd86dc1527dd1b6475f10"

RPROVIDES:${PN} += "extractpdfmark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-cpp.so.0 \
libstdc++.so.6"

inherit rpm
