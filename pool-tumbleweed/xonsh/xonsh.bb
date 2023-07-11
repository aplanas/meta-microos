SUMMARY = "A general purpose, Python-powered shell"
DESCRIPTION = "xonsh is a Python-powered, Unix-gazing shell language and command prompt. The language is a superset of Python 3.5+ with additional shell primitives. xonsh (pronounced conch) is meant for the daily use of experts and novices alike."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "xonsh-0.14.0-1.1.noarch.rpm"
RPM_HASH = "2591391747f1f95f636a7399836c12c2a021c5a08aafaa2022415fff2b9aba53cccd8acfbf718841283f1ec6bb0166f640cd551460681a4f9c76e132a423cdf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xonsh \
python3.11dist-xonsh \
python3dist-xonsh \
xonsh"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-base"

inherit rpm
