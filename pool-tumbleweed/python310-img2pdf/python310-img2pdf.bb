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

RPM_NAME = "python310-img2pdf-0.4.4-1.7.noarch.rpm"
RPM_HASH = "1bbaf92963d30cb0477f3a2cd850dc0630bbfa121cf0168e669ebbe6cd6b56962a45c9e84775263e3824d8d0c75c2eb8dc4f8dca795fc70f2765c91ca1ed9ca8"
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
