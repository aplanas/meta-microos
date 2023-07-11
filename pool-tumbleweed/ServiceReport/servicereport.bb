SUMMARY = "A tool to validate and repair First Failure Data Capture (FFDC) configuration"
DESCRIPTION = "ServiceReport is a python based tool that investigates the incorrect \
First Failure Data Capture (FFDC) configuration and optionally repairs \
the incorrect configuration"
LICENSE = "GPL-2.0-only"

PV = "2.2.3+git1.55a13db1c256"

RPM_NAME = "ServiceReport-2.2.3+git1.55a13db1c256-3.6.noarch.rpm"
RPM_HASH = "de5e44721c340d570495012a6aed8b897b9041c97b8ad0310bb92ff61b2364d5a693f53df1c7d4ef3ae9ef9268f5dc824592288486fcdaf7029016be9aff78fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ServiceReport \
python3.11dist-servicereport \
python3dist-servicereport"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
systemd"

inherit rpm
