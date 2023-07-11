SUMMARY = "Tiny date, time diff calculator with timers"
DESCRIPTION = "pdd (Python3 Date Diff) is a small cmdline utility to calculate date and time difference. It can also be used as a timer"
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "python39-pdd-1.7-1.5.noarch.rpm"
RPM_HASH = "3f07cc154b7b7c180cec41602b3cefc067603abc803ce62b5ab6a3fb5f3ab7a623d91da9661a448d4d8e2de6e3d595d6b2e7626a86f91b2cdeae418e010fb921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pdd \
python39-pdd \
python3dist-pdd"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-setuptools \
update-alternatives"

inherit rpm
