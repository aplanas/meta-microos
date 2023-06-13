SUMMARY = "Python Task Warrior library"
DESCRIPTION = "Tasklib is a Python library for interacting with taskwarrior \
databases, using a queryset API similar to that of Django's ORM."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python310-tasklib-2.5.1-1.3.noarch.rpm"
RPM_HASH = "02f7adb1b2ee2e89b62ba7b6349cc8a0bd36ba6c25f0d8d2d570d2cd7a9d23c140870608a974c1c006b9b825f77c0c10b81e33fd8f7b097593c2e089e1229b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tasklib \
python3.10dist(tasklib) \
python310-tasklib \
python3dist(tasklib)"

RDEPENDS:${PN} += "python(abi) \
python310-pytz \
python310-tzlocal \
taskwarrior"

inherit rpm
