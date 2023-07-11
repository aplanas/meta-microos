SUMMARY = "Single-source support for Python 3 and 2"
DESCRIPTION = "Future is a compatibility layer between Python 2 and Python 3. \
It allows you to use a single Python 3.x-compatible codebase to \
support both Python 2 and Python 3."
LICENSE = "MIT & Python-2.0"

PV = "0.18.3"

RPM_NAME = "python310-future-0.18.3-4.1.noarch.rpm"
RPM_HASH = "80ad1442cc6fd42211c96a400c4f12984d6ce49b2caaad14f08ef7f03472b87fb0fca7231c80bcfcb6ba6cda2158818924d195eafe731340b109706e62e6a907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-future \
python310-future \
python3dist-future"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
