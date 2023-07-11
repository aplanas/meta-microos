SUMMARY = "Django integration for WebTest"
DESCRIPTION = "Instant integration of Ian Bicking's WebTest with django's testing framework."
LICENSE = "MIT"

PV = "1.9.10"

RPM_NAME = "python310-django-webtest-1.9.10-1.6.aarch64.rpm"
RPM_HASH = "68523d2f50160ec108aa5920b0f08c033407a58e7f92cb3fe77de8f6e62186129afb5a5ae82e07541fdc3e667c151522a2fb0a8c89259899f3dcc0cc70e4c038"

RPROVIDES:${PN} += "python3.10dist-django-webtest \
python310-django-webtest \
python3dist-django-webtest"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-WebTest"

inherit rpm
