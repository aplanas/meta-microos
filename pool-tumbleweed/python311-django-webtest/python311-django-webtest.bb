SUMMARY = "Django integration for WebTest"
DESCRIPTION = "Instant integration of Ian Bicking's WebTest with django's testing framework."
LICENSE = "MIT"

PV = "1.9.10"

RPM_NAME = "python311-django-webtest-1.9.10-1.6.aarch64.rpm"
RPM_HASH = "7be9fe3d448e0370b67707fb68c159b5b21ea254c0ece64bd322e58de0d979d6e4504e8f075d1ace5a05ed9f75aafc7d51c2cc8d2a1e02773f99987674a9f801"

RPROVIDES:${PN} += "python3-django-webtest \
python3.11dist-django-webtest \
python311-django-webtest \
python3dist-django-webtest"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-WebTest"

inherit rpm
