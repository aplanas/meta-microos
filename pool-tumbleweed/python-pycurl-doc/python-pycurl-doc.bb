SUMMARY = "Documentation for python-curl"
DESCRIPTION = "This module provides bindings for the cURL library. \
 \
This package contains documentation and examples."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "7.45.2"

RPM_NAME = "python-pycurl-doc-7.45.2-4.1.noarch.rpm"
RPM_HASH = "2710b887829d9b64134530e2b5e0d611177c7a2f3910a3d4c53a4ad572dc4926ea977b1afbe889ba01b149ddc3d85389c38e0b4310ac5aa081e0f8fb5ab40c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pycurl-doc \
python310-pycurl-doc \
python311-pycurl-doc \
python39-pycurl-doc"
RDEPENDS:${PN} += ""

inherit rpm
