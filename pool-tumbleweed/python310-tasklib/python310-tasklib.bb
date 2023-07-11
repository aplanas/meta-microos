SUMMARY = "Python Task Warrior library"
DESCRIPTION = "Tasklib is a Python library for interacting with taskwarrior \
databases, using a queryset API similar to that of Django's ORM."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python310-tasklib-2.5.1-1.5.noarch.rpm"
RPM_HASH = "1a679bec2e6cefbd22e0e3f6b043ac17da961cfe1a58ec2bde21cf51c065c4cd7b1ddd3b5a4679d10f28d054dec2f31bb1af237c1db26df6274c31876da3b1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tasklib \
python310-tasklib \
python3dist-tasklib"

RDEPENDS:${PN} += "python-abi \
python310-pytz \
python310-tzlocal \
taskwarrior"

inherit rpm
