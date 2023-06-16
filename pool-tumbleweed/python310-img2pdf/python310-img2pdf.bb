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

RPM_NAME = "python310-img2pdf-0.4.4-1.5.noarch.rpm"
RPM_HASH = "aa84967f2e90aad5fdf15a0e57fc938e2d174ccff0c92c765ace556e40f024b8ae113f5ec8baddbb8eca479a873bb1976cd8debd27c4c334f017e3266e570a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-img2pdf \
python3.10dist-img2pdf \
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
