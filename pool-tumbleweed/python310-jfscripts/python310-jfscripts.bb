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

RPM_NAME = "python310-jfscripts-1.1.0-1.5.noarch.rpm"
RPM_HASH = "27bd739ae47858cb6d1060ef77c3bb0455deb45836d0a9bffcbd85fddcb65d757d58e85d256a755b03aade9103d70e06600ffc5874dd9cb954a4061ef3090556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jfscripts \
python310-jfscripts \
python3dist-jfscripts"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyPDF2 \
python310-sphinx-argparse \
python310-termcolor \
update-alternatives"

inherit rpm
