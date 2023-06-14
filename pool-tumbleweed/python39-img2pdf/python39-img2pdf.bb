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

RPM_NAME = "python39-img2pdf-0.4.4-1.5.noarch.rpm"
RPM_HASH = "24b87f42ab190c50112678c504eb0bdb5945879675608b1e58725718e7f46caf1a455aa685fa78da7a96355865d86babd07628432b73838e2908b07482fab46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-img2pdf \
python39-img2pdf \
python3dist-img2pdf"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Pillow \
python39-pdfrw \
python39-pikepdf \
python39-setuptools \
update-alternatives"

inherit rpm
