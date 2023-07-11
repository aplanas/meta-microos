SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-test-2.0.2-4.1.noarch.rpm"
RPM_HASH = "44d32ccd5731d38b384baa8c4f383a319ba848098e9d3cf114776d093773372b5bdc66f7c269146a693a119355007ce69dc7f2509efd198c032ad15a770617a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-test"

RDEPENDS:${PN} += "python39-hypothesis \
python39-pandas \
python39-pytest \
python39-pytest-asyncio \
python39-pytest-xdist"

inherit rpm
