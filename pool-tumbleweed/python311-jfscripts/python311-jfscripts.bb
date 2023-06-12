SUMMARY = "A collection of various tools written by Josef Friedrich"
DESCRIPTION = "A collection of various tools written by Josef Friedrich \
  * dns-ipv6-prefix.py \
  * extract-pdftext.py \
  * find-dupes-by-size.py \
  * list-files.py \
  * mac-to-eui64.py \
  * pdf-compress.py \
  * image-into-pdf.py"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-jfscripts-1.1.0-1.4.noarch.rpm"
RPM_HASH = "abb6fc076ec6a466bdcf3cb0e244a82ac10d87f043be26425d6ab27deedd95cef3de2f14c98dc7381567795bd754d70ce75041a5295e17f5f72f23e2b8eb6bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jfscripts) \
python311-jfscripts \
python3dist(jfscripts)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyPDF2 \
python311-sphinx-argparse \
python311-termcolor \
update-alternatives"

inherit rpm
