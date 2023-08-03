SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python39-WebOb-1.8.7-7.1.noarch.rpm"
RPM_HASH = "8e5519620ca22e5c5ea8ae85e610acee726d3aa65541cc2817383498e121ff178fbfc9ef91d625931c6628de8027e209c1b525a83280058edc840b6f07317ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-webob \
python39-WebOb \
python3dist-webob"

RDEPENDS:${PN} += "python-abi"

inherit rpm
