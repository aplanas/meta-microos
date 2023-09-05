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

RPM_NAME = "python311-img2pdf-0.4.4-2.1.noarch.rpm"
RPM_HASH = "4ec33227cb8aff222211c0fe832f157eeee2e07326880b31a14d2d79aced7aeb637f726142bcfb5021c3206b80b17e14706c7530aa026fadd07aa3b9ac0fabf7"
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
