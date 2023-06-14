SUMMARY = "Django integration for WebTest"
DESCRIPTION = "Instant integration of Ian Bicking's WebTest with django's testing framework."
LICENSE = "MIT"

PV = "1.9.10"

RPM_NAME = "python310-django-webtest-1.9.10-1.4.aarch64.rpm"
RPM_HASH = "7ac754d9b08bbccc7044f64bfb33b2aba11193687009c7db3104bb534adf889b9ac6fad914aeef360f0ca6de4ec9384a6e1cfcda85c09d6d27fab5eec8767325"

RPROVIDES:${PN} += "python3-django-webtest \
python3.10dist-django-webtest \
python310-django-webtest \
python3dist-django-webtest"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-WebTest"

inherit rpm
