SUMMARY = "Library for installing a WSGI application in place of a real URI for testing"
DESCRIPTION = "Testing a WSGI application normally involves starting a server at a local host \
and port, then pointing your test code to that address. Instead, this library \
lets you intercept calls to any specific host/port combination and redirect \
them into a `WSGI application`_ importable by your test program.  Thus, you \
can avoid spawning multiple processes or threads to test your Web app."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "python311-wsgi_intercept-1.12.1-1.1.noarch.rpm"
RPM_HASH = "6620992ff9c65b9360374a9e36d5b383d3deaa0c479f965e8e886b28e9c183056f5e9fce09fd8d3e4d77eb99fb25f2d47944b14e2807450eeb8615b808e50511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wsgi-intercept \
python3.11dist-wsgi-intercept \
python311-wsgi-intercept \
python3dist-wsgi-intercept"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-urllib3"

inherit rpm
