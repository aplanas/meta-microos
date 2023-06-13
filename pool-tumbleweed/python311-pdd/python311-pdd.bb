SUMMARY = "Tiny date, time diff calculator with timers"
DESCRIPTION = "pdd (Python3 Date Diff) is a small cmdline utility to calculate date and time difference. It can also be used as a timer"
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "python311-pdd-1.7-1.4.noarch.rpm"
RPM_HASH = "dc7c1220771345b8dd8fac729574ae0dc6f67155332b6b0bd4abeef3c40af09c092d2242fee3fb872924f6fea7f658c6663905adcc4ae544bb53596d55ecdb6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pdd) \
python311-pdd \
python3dist(pdd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-python-dateutil \
python311-setuptools \
update-alternatives"

inherit rpm
