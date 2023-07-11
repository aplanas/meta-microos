SUMMARY = "A skin for the Django Admin-Interface"
DESCRIPTION = "A jazzy skin for the Django Admin-Interface."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "3.0.6"

RPM_NAME = "python310-django-grappelli-3.0.6-1.3.noarch.rpm"
RPM_HASH = "4563f2018c3523d4065758883939b8ab61e75c44fad6a56eb1af1a8e7270f07fa7bb80c812583ccb13d4ee86efab355777bbca091965aa29958fd419464bdee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-grappelli \
python310-django-grappelli \
python3dist-django-grappelli"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
