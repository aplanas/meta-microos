SUMMARY = "Django integration for WebTest"
DESCRIPTION = "Instant integration of Ian Bicking's WebTest with django's testing framework."
LICENSE = "MIT"

PV = "1.9.10"

RPM_NAME = "python39-django-webtest-1.9.10-1.6.aarch64.rpm"
RPM_HASH = "8e3f6302c9eaaf5f11ec3776776307579513da41de088edd5e674bedc32ab3e642840d26303dfb9c7caee2c20df63b713e6b9fc220d76841636236cedea9a073"

RPROVIDES:${PN} += "python3.9dist-django-webtest \
python39-django-webtest \
python3dist-django-webtest"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-WebTest"

inherit rpm
