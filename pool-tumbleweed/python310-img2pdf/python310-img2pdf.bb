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

RPM_NAME = "python310-img2pdf-0.4.4-2.1.noarch.rpm"
RPM_HASH = "8cdcf2362cf763f1e1149e60ebf8480588b2705841c19fa7e61a0aa34a02455be752511222bbdbe5df6142e09620698000a0eb20ab0ef963618089c34a5d93e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-img2pdf \
python310-img2pdf \
python3dist-img2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-pdfrw \
python310-pikepdf \
python310-setuptools \
update-alternatives"

inherit rpm
