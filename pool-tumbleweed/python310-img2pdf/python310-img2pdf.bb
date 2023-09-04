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

RPM_NAME = "python310-img2pdf-0.4.4-1.1.noarch.rpm"
RPM_HASH = "dd922e333027a682cd5e85a91b184d48115a9e4b70b94070656d3e69ad3cc8f1a9e29183b63671c86ce5a640406f0ead33e06128ee7a180fb2bd093c482655dd"
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
