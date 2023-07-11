SUMMARY = "A reusable Django field to store validated JSON"
DESCRIPTION = "Django-jsonfield is a reusable Django field that allows you to \
store validated JSON in your model."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-django-jsonfield-3.1.0-3.8.noarch.rpm"
RPM_HASH = "a27bb85383a0385fa6cc3e39e95c7bd06f9289b5519266e214703232981d1140b37eba4a18eaffc58ef497a7d3856c8435e44315dc54f3479eed60374dbd222f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonfield \
python310-django-jsonfield \
python3dist-jsonfield"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
