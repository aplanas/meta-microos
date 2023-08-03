SUMMARY = "Library for installing a WSGI application in place of a real URI for testing"
DESCRIPTION = "Testing a WSGI application normally involves starting a server at a local host \
and port, then pointing your test code to that address. Instead, this library \
lets you intercept calls to any specific host/port combination and redirect \
them into a `WSGI application`_ importable by your test program.  Thus, you \
can avoid spawning multiple processes or threads to test your Web app."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "python39-wsgi_intercept-1.12.1-1.1.noarch.rpm"
RPM_HASH = "ad6a017ff078380a4ec3ad2b24544bafbc12288a44fb9039945888d68b2f3a20819e2f8d4c7bfc7429b12bbe6f944e8cc61f2ef3618e1ad04d88897713c2577e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wsgi-intercept \
python39-wsgi-intercept \
python3dist-wsgi-intercept"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-urllib3"

inherit rpm
