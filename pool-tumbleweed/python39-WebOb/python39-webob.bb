SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python39-WebOb-1.8.7-6.3.noarch.rpm"
RPM_HASH = "17101cd3fa4249e9631b75df6ecef31c0cbd44adc1a060181014726321a784a701f81bf8a95ede5c8f17972072e94228df253c03836f6775982b1f59e1391e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-webob \
python39-WebOb \
python3dist-webob"

RDEPENDS:${PN} += "python-abi"

inherit rpm
