SUMMARY = "Documentation for python-curl"
DESCRIPTION = "This module provides bindings for the cURL library. \
 \
This package contains documentation and examples."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.2"

RPM_NAME = "python-pycurl-doc-7.45.2-4.4.noarch.rpm"
RPM_HASH = "0e9d7d22447a72a7ecbceb7de92fd3da26bc17043fea81e916af76eac1bca910d2e490bfc0f753c58a07d63557ea68346108b538de1893e5cda8d9cf5c0c2159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pycurl-doc \
python310-pycurl-doc \
python311-pycurl-doc \
python39-pycurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
