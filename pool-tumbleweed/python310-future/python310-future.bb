SUMMARY = "Single-source support for Python 3 and 2"
DESCRIPTION = "Future is a compatibility layer between Python 2 and Python 3. \
It allows you to use a single Python 3.x-compatible codebase to \
support both Python 2 and Python 3."
LICENSE = "MIT & Python-2.0"

PV = "0.18.3"

RPM_NAME = "python310-future-0.18.3-3.1.noarch.rpm"
RPM_HASH = "b1bb90ab1c3474a68736633db5a6bf679ac8d6c5de93e5cb85888160fb62ea55f236b93a7892753baecaed029973f5e71515de9f9c43d5119d951e0127817498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-future \
python3.10dist-future \
python310-future \
python3dist-future"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
