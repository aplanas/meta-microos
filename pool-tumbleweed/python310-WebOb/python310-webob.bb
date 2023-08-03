SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python310-WebOb-1.8.7-7.1.noarch.rpm"
RPM_HASH = "8ca7e9cb4196f4c60d2b4c5e9feffa59f45db9e3b26831f2eacec1e25f071a67d44ebf8ce6b094ebb41a6c40f68c6e33dcc1d647c19a9aaa312ed02e56f75708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-webob \
python310-WebOb \
python3dist-webob"

RDEPENDS:${PN} += "python-abi"

inherit rpm
