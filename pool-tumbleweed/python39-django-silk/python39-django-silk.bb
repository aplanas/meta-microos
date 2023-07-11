SUMMARY = "Profiling for the Django Framework"
DESCRIPTION = "Profiling for the Django Framework."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python39-django-silk-5.0.3-1.6.noarch.rpm"
RPM_HASH = "aa8b24ebc0f7d91ee1eca39dae2109d5abd618e561adf7b00d98a05c6e27384ea695b1cea019e189f219c0b3a39c15c69d95d877f7544f2082b5953b4168718e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-silk \
python39-django-silk \
python3dist-django-silk"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Jinja2 \
python39-Pillow \
python39-Pygments \
python39-autopep8 \
python39-gprof2dot \
python39-python-dateutil \
python39-pytz \
python39-requests \
python39-sqlparse"

inherit rpm
