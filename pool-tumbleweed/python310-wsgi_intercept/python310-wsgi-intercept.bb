SUMMARY = "Library for installing a WSGI application in place of a real URI for testing"
DESCRIPTION = "Testing a WSGI application normally involves starting a server at a local host \
and port, then pointing your test code to that address. Instead, this library \
lets you intercept calls to any specific host/port combination and redirect \
them into a `WSGI application`_ importable by your test program.  Thus, you \
can avoid spawning multiple processes or threads to test your Web app."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "python310-wsgi_intercept-1.12.1-1.1.noarch.rpm"
RPM_HASH = "11d7c887a191f74fa0122c3274385203b271c172508ab539e1e054f665271c8771b068dabe6c88c8683807b72d9993cdb3241b116ddcf810e6087a9481167f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wsgi-intercept \
python310-wsgi-intercept \
python3dist-wsgi-intercept"

RDEPENDS:${PN} += "python-abi \
python310-six \
python310-urllib3"

inherit rpm
