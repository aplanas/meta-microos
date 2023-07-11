SUMMARY = "Python module for converting images to PDF via direct JPEG inclusion"
DESCRIPTION = "This module losslessly converts raster images to PDF. The file size \
will not unnecessarily increase. It can, for example, be used to \
create a PDF document from a number of scans that are only available \
in JPEG format. Existing solutions would either re-encode the input \
JPEG files (leading to quality loss) or store them in the Deflate \
format which results in the PDF becoming unnecessarily large in terms \
of file size."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.4"

RPM_NAME = "python311-img2pdf-0.4.4-1.7.noarch.rpm"
RPM_HASH = "e0fee3655c5b60a8349a1c70c90d5d3e9b161c214f44f1a489c8d2bb651921b52a016e25717844ac34299fdcd663ccd144ba8e6a49dff369b866b902a5f3b8b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-img2pdf \
python3.11dist-img2pdf \
python311-img2pdf \
python3dist-img2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-pdfrw \
python311-pikepdf \
python311-setuptools \
update-alternatives"

inherit rpm
