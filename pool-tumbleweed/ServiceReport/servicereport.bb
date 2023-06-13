SUMMARY = "A tool to validate and repair First Failure Data Capture (FFDC) configuration"
DESCRIPTION = "ServiceReport is a python based tool that investigates the incorrect \
First Failure Data Capture (FFDC) configuration and optionally repairs \
the incorrect configuration"
LICENSE = "GPL-2.0-only"

PV = "2.2.3+git1.55a13db1c256"

RPM_NAME = "ServiceReport-2.2.3+git1.55a13db1c256-3.5.noarch.rpm"
RPM_HASH = "c0813a25cf5ff9902debbd3559412985570e11b75ba17d22a8282b5c103aacbe9e5c6c3343e4c597e5d3a9eef7c30c7b3f6233902a7e10ea57e5885fdd90c53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ServiceReport \
python3.10dist(servicereport) \
python3dist(servicereport)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
systemd"

inherit rpm
