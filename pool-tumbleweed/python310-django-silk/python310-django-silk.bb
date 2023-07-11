SUMMARY = "Profiling for the Django Framework"
DESCRIPTION = "Profiling for the Django Framework."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python310-django-silk-5.0.3-1.6.noarch.rpm"
RPM_HASH = "f3dbd59d975159730d5593b58b69566b83160b85e2a96b55a62086a885a6a2190b726fed96c18f5b04aba011bcbf41b458ab3f0421d10ddb9999c03f083e4ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-silk \
python310-django-silk \
python3dist-django-silk"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Jinja2 \
python310-Pillow \
python310-Pygments \
python310-autopep8 \
python310-gprof2dot \
python310-python-dateutil \
python310-pytz \
python310-requests \
python310-sqlparse"

inherit rpm
