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

RPM_NAME = "python39-img2pdf-0.4.4-1.7.noarch.rpm"
RPM_HASH = "62cf05d78a5e634517fa651d2e5994f98198266fac70691fdf9801d46e4b7e3a764d1088f9821117e7c43e570046ae671f46c42fcc57d9faebc33ef1ee6c92e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-img2pdf \
python39-img2pdf \
python3dist-img2pdf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-pdfrw \
python39-pikepdf \
python39-setuptools \
update-alternatives"

inherit rpm
