SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python311-WebOb-1.8.7-6.1.noarch.rpm"
RPM_HASH = "f76585c0927f28f42d1be0e0b2069e6f8eb5a8d97fd81d47965ef354e76bfb2fcaec9c4aef5e67585dd9c9409c8503e0b7eab760f1a32d175c23927978e48f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(webob) \
python311-WebOb \
python3dist(webob)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
