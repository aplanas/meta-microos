SUMMARY = "Additional scripts in python"
DESCRIPTION = "Additional scripts for the use of openQA in the python programming language."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-python-scripts-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "9d341dc248a663956a6d47d2a24a116deb080bd3d73904d890c871c1cd78fec24c686e63238f86c02d99fb6bf20f7f4e80fdc9757a700c2fe3fc6f93c26ea621"

RPROVIDES:${PN} += "openQA-python-scripts"

RDEPENDS:${PN} += "/usr/bin/python3 \
openQA-client \
python3-base \
python3-requests"

inherit rpm
