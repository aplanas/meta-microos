SUMMARY = "WSGI request and response object"
DESCRIPTION = "WebOb provides wrappers around the WSGI request environment, and an \
object to help create WSGI responses. \
 \
The objects map much of the specified behavior of HTTP, including \
header parsing and accessors for other standard parts of the \
environment."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python310-WebOb-1.8.7-6.3.noarch.rpm"
RPM_HASH = "6dfa4811a143e5abcbb641ea8c4334d43bf736ff61c6c16afe1fcbd2f256ecf4914fae0751a61f131164b10ff0b9288d0cc339ebf8e9d50377d29863e81f8261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-webob \
python310-WebOb \
python3dist-webob"

RDEPENDS:${PN} += "python-abi"

inherit rpm
