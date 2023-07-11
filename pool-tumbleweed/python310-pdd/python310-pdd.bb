SUMMARY = "Tiny date, time diff calculator with timers"
DESCRIPTION = "pdd (Python3 Date Diff) is a small cmdline utility to calculate date and time difference. It can also be used as a timer"
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "python310-pdd-1.7-1.5.noarch.rpm"
RPM_HASH = "f1901c44bdb1ba0985d30eb309d100873544ac328e51174e942324ef01c69c837aef9fe6400e4c78c726a4c331d433e710ece509680047bb00942c137e443eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pdd \
python310-pdd \
python3dist-pdd"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-setuptools \
update-alternatives"

inherit rpm
