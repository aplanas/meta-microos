SUMMARY = "Python Task Warrior library"
DESCRIPTION = "Tasklib is a Python library for interacting with taskwarrior \
databases, using a queryset API similar to that of Django's ORM."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python39-tasklib-2.5.1-1.5.noarch.rpm"
RPM_HASH = "b87a337d4a03ea283226dabe09fe9c2c8e17733b7f449bb15fe219aa02256fc9804e448427e434ff6770dc3125a4a06f5a18b588f524962d778f47b0b0ccd28f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tasklib \
python39-tasklib \
python3dist-tasklib"

RDEPENDS:${PN} += "python-abi \
python39-pytz \
python39-tzlocal \
taskwarrior"

inherit rpm
