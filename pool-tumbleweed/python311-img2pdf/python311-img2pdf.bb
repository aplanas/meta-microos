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

RPM_NAME = "python311-img2pdf-0.4.4-1.1.noarch.rpm"
RPM_HASH = "b39fe974af39ba0d2c87e5a1fab81b3cfb27a4c65bd00a4acf8d72c193747dffb79eddb08f942be5c17da683f49586cc438f5953fdd463a811805e8ed63a435b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "img2pdf \
python3-img2pdf \
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
