SUMMARY = "Profiling for the Django Framework"
DESCRIPTION = "Profiling for the Django Framework."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python311-django-silk-5.0.3-1.6.noarch.rpm"
RPM_HASH = "db97a1edfe1fd33927844ab4e99950174c9ce052ffb756f035220c64e0d1d2901996b66517ae0197f20a9b55180794142accd53b29204df4d610dd9147c07699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-silk \
python3.11dist-django-silk \
python311-django-silk \
python3dist-django-silk"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Jinja2 \
python311-Pillow \
python311-Pygments \
python311-autopep8 \
python311-gprof2dot \
python311-python-dateutil \
python311-pytz \
python311-requests \
python311-sqlparse"

inherit rpm
