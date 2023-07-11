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

RPM_NAME = "python39-jfscripts-1.1.0-1.5.noarch.rpm"
RPM_HASH = "e12660487603f416699d262053ebf6c0f75d7fc2412b2f5921d2169c931783422c6cbed9278374e50ec3ea95d86af9bfdbf3cebe21d824d1d5adbb35cce280e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jfscripts \
python39-jfscripts \
python3dist-jfscripts"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyPDF2 \
python39-sphinx-argparse \
python39-termcolor \
update-alternatives"

inherit rpm
