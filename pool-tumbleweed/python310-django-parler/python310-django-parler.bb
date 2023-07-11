SUMMARY = "Simple Django model translations"
DESCRIPTION = "Simple Django model translations without nasty hacks, including admin integration."
LICENSE = "Apache-2.0"

PV = "2.3"

RPM_NAME = "python310-django-parler-2.3-3.5.noarch.rpm"
RPM_HASH = "0aeae0632cbe47dafdb2a521549a4433e47c44405e28c7f306c1cba0e373f8df44b4d15c4ccdd656daabab651ce28cf8acf497117f23e1dfd7e0e5c4f1148c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-parler \
python310-django-parler \
python3dist-django-parler"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
