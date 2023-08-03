SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python311-WebOb-1.8.7-7.1.noarch.rpm"
RPM_HASH = "bde111cc91dbc3d239961e6d704709386fecba38a185b7c4692252cfe35ea77b0d148b4b075398c8e51fb581f966b9a7602779729e4f0f4ddc3558674c89e5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WebOb \
python3.11dist-webob \
python311-WebOb \
python3dist-webob"

RDEPENDS:${PN} += "python-abi"

inherit rpm
