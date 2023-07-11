SUMMARY = "Single-source support for Python 3 and 2"
DESCRIPTION = "Future is a compatibility layer between Python 2 and Python 3. \
It allows you to use a single Python 3.x-compatible codebase to \
support both Python 2 and Python 3."
LICENSE = "MIT & Python-2.0"

PV = "0.18.3"

RPM_NAME = "python39-future-0.18.3-4.1.noarch.rpm"
RPM_HASH = "80540f98af40ebeb972a1826ba794f11353b09eae4cb203ac825c94a790ebcc5d6bb6b72276122c5171dc3d80ade2e2d40def032f6e64eaf2a1d92ddc5eca3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-future \
python39-future \
python3dist-future"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
