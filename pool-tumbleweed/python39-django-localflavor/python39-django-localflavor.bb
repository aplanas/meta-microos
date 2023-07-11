SUMMARY = "Country-specific Django helpers"
DESCRIPTION = "Country-specific Django helpers."
LICENSE = "BSD-3-Clause"

PV = "4.0"

RPM_NAME = "python39-django-localflavor-4.0-1.3.noarch.rpm"
RPM_HASH = "852a7582d45a8f37e2448c3d3722c91355b7fa60cb10bd5de26c68bd1a5119e7796df29c6dd15ae3a35dcce047b5ea9cfd4d291a02200950968a5f2d11504153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-localflavor \
python39-django-localflavor \
python3dist-django-localflavor"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-python-stdnum"

inherit rpm
