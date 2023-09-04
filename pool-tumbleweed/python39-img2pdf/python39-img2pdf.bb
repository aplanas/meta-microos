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

RPM_NAME = "python39-img2pdf-0.4.4-1.1.noarch.rpm"
RPM_HASH = "c7c6901069db9f2880f472206fbfc5b42cb827646045fe5d93311348d6e7ca6cebc3bfb4093eea0228bfe90fa5eae445c665fea11424113d9568bf3aaae3da79"
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
