SUMMARY = "Django integration for WebTest"
DESCRIPTION = "Instant integration of Ian Bicking's WebTest with django's testing framework."
LICENSE = "MIT"

PV = "1.9.10"

RPM_NAME = "python39-django-webtest-1.9.10-1.4.aarch64.rpm"
RPM_HASH = "b11af243e4f309ace6d3eb5ec93435f7fa24e6efb1551140d9cc279812b460a3832366bb3dec1f1000e920e3fca627acca6af8721ce19c93309946f64af36201"

RPROVIDES:${PN} += "python3.9dist(django-webtest) \
python39-django-webtest \
python39-django-webtest(aarch-64) \
python3dist(django-webtest)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-WebTest"

inherit rpm
