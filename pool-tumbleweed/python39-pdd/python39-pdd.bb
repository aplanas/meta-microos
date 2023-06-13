SUMMARY = "Tiny date, time diff calculator with timers"
DESCRIPTION = "pdd (Python3 Date Diff) is a small cmdline utility to calculate date and time difference. It can also be used as a timer"
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "python39-pdd-1.7-1.4.noarch.rpm"
RPM_HASH = "26244b3901ab7374c5defe22f637c303a0abe1608e5f8e6a1a1435e18a031071cc3e0811a418a7793261290fa8f1a041e19a940dd3906b6dca2b8fef6358fc44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pdd) \
python39-pdd \
python3dist(pdd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-python-dateutil \
python39-setuptools \
update-alternatives"

inherit rpm
