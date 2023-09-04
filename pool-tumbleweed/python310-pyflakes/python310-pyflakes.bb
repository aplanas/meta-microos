SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-pyflakes-3.1.0-1.1.noarch.rpm"
RPM_HASH = "7a2e5703a990ed99195388781e3473fd7fd75063033b2439d973a1462bfe77c5a0a4b1e29304ad08ecb5710a4bf3ed9e23e2a99a1a5b8f7efedbf950b78c95bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyflakes \
python310-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
