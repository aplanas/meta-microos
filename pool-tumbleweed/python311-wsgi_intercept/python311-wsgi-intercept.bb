SUMMARY = "Library for installing a WSGI application in place of a real URI for testing"
DESCRIPTION = "Testing a WSGI application normally involves starting a server at a local host \
and port, then pointing your test code to that address. Instead, this library \
lets you intercept calls to any specific host/port combination and redirect \
them into a `WSGI application`_ importable by your test program.  Thus, you \
can avoid spawning multiple processes or threads to test your Web app."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python311-wsgi_intercept-1.11.0-1.3.noarch.rpm"
RPM_HASH = "c673db1ac01eefec36e0707848dd3207774488622198df4cb411899c2632daa2fa8fd87fea0f2c608c63058d6b405a716d45365af4897ddff1c9a224dde6db80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wsgi-intercept) \
python311-wsgi_intercept \
python3dist(wsgi-intercept)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
