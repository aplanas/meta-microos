SUMMARY = "Tiny date, time diff calculator with timers"
DESCRIPTION = "pdd (Python3 Date Diff) is a small cmdline utility to calculate date and time difference. It can also be used as a timer"
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "python311-pdd-1.7-1.5.noarch.rpm"
RPM_HASH = "96fe4c9bb462f1a37c37c6cd2982b32d1db2c44f8a3795b6fab784837f226fcfbce4daa2ff13153830ebd3c893d4708e23f4fbc4bac78638781c2b6c75fce28c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdd \
python3.11dist-pdd \
python311-pdd \
python3dist-pdd"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-setuptools \
update-alternatives"

inherit rpm
