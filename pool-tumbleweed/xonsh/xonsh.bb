SUMMARY = "A general purpose, Python-powered shell"
DESCRIPTION = "xonsh is a Python-powered, Unix-gazing shell language and command prompt. The language is a superset of Python 3.5+ with additional shell primitives. xonsh (pronounced conch) is meant for the daily use of experts and novices alike."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.13.4"

RPM_NAME = "xonsh-0.13.4-1.3.noarch.rpm"
RPM_HASH = "2337ae1381648ccf26ea8bccd5bc85023e0e84c2ed069b86792731c5c478e279d9a43b5e799ae7432fc673213467a8366e2150916ce25c637515b646f6801e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xonsh \
python3.10dist-xonsh \
python3dist-xonsh \
xonsh"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-base"

inherit rpm
