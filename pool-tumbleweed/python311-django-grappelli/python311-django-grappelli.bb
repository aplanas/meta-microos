SUMMARY = "A skin for the Django Admin-Interface"
DESCRIPTION = "A jazzy skin for the Django Admin-Interface."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "3.0.6"

RPM_NAME = "python311-django-grappelli-3.0.6-1.1.noarch.rpm"
RPM_HASH = "c747a8c93b91e2dc7439a19754c4253b43e8857623ee58f2098f3c055248cc43c4e78747283456d9332102e13e59c7c032350dec10e6c3e8eda554b20bbbedfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-grappelli) \
python311-django-grappelli \
python3dist(django-grappelli)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
