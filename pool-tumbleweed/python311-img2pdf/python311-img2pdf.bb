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

RPM_NAME = "python311-img2pdf-0.4.4-1.5.noarch.rpm"
RPM_HASH = "f7dc0c693fa791a34ef9eec096904510243d2aaf30887a8eca9b7f876170b75d75dae016907c5e928469ba8b83ff8b4da6ca57b60ed488d34934aa8387972c78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-img2pdf \
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
