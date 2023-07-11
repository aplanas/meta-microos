SUMMARY = "Python package for logging in colour"
DESCRIPTION = "Technicolor provides logging in colour and logging of function usage by \
means of a decorator."
LICENSE = "GPL-3.0-only"

PV = "2017.1.16.1544"

RPM_NAME = "python310-technicolor-2017.1.16.1544-3.15.noarch.rpm"
RPM_HASH = "e21085732337045a089197e71da361d538a3a17c7997f7835ccd57dd1ab57edf6796dc63915544b963b2b90aab8efc1ad70e7c451651bb85e175c2e47ff74834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-technicolor \
python310-technicolor \
python3dist-technicolor"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
