SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python311-WebOb-1.8.7-6.3.noarch.rpm"
RPM_HASH = "17152ff3848182f8460769af62683ad78c6873875fa944b5dcc076cb7c6c6ca3819226fe6aaf651b88dc92d0e263c1f61a7089902e7470b5c81fe828de67610b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WebOb \
python3.11dist-webob \
python311-WebOb \
python3dist-webob"

RDEPENDS:${PN} += "python-abi"

inherit rpm
