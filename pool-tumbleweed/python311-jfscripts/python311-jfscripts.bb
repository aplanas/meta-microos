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

RPM_NAME = "python311-jfscripts-1.1.0-1.5.noarch.rpm"
RPM_HASH = "239aace114b03564b5204964e5cf19a57811862a6e26fcc4930410ae058f1bf2b92f66c6b077ce81dc33122447668747f06651bfb1457a673a9c558f749b47a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jfscripts \
python3.11dist-jfscripts \
python311-jfscripts \
python3dist-jfscripts"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyPDF2 \
python311-sphinx-argparse \
python311-termcolor \
update-alternatives"

inherit rpm
