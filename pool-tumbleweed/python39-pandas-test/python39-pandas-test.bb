SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-test-2.0.3-1.3.noarch.rpm"
RPM_HASH = "7d3995a4c47005476902282de8593d91692d5b50f140a0fdf00b9aa9fe7c59a975ea5fd6a0fe8253aa5ff328177287a5c237ee2c60002b2e7fc40c2419765a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-test"

RDEPENDS:${PN} += "python39-hypothesis \
python39-pandas \
python39-pytest \
python39-pytest-asyncio \
python39-pytest-xdist"

inherit rpm
