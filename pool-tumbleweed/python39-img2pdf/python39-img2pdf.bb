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

RPM_NAME = "python39-img2pdf-0.4.4-2.1.noarch.rpm"
RPM_HASH = "d070ed03f65a872049de19c10c4508e077f9e087f5f7dbad4de222b28e5d26f537478327ed28c266de4313bd87f6055b7f4abe11e65e9d9ef83f07280fc3e50f"
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
