SUMMARY = "WSGI Proxy Implementation"
DESCRIPTION = "Proxy support for WebOb or classic WSGI applications"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-WSGIProxy2-0.5.1-3.1.noarch.rpm"
RPM_HASH = "8764af87b9c8eeae9db058b862dd7aa0b2af57c8e7f236938faee784d42c2bd6cc8aebfcc7c2d9acda37408f7ce58e684349f051e96fff1cf065e3e8199e3acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wsgiproxy2) \
python311-WSGIProxy2 \
python3dist(wsgiproxy2)"

RDEPENDS:${PN} += "python(abi) \
python311-WebOb \
python311-requests \
python311-urllib3"

inherit rpm
