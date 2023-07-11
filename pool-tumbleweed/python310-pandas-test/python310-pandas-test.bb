SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-test-2.0.2-4.1.noarch.rpm"
RPM_HASH = "0aaac3ad0d5dc4d11787893a6b76d1ccc2364638ab9db3fda03b310f10e556e7e2b352c18002cd73a08d1b1a7b81abc0671f03cc00edd67cd34b0d15218772e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-test"

RDEPENDS:${PN} += "python310-hypothesis \
python310-pandas \
python310-pytest \
python310-pytest-asyncio \
python310-pytest-xdist"

inherit rpm
