SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-test-2.0.3-1.2.noarch.rpm"
RPM_HASH = "a6831866de5e57bacd0849e51bfee583a66d70446fed306111350bd1644912edf5809f7333efa89afe8352170758f6c0d331b11a79f44f552a8a27ac18ff41c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-test \
python311-pandas-test"

RDEPENDS:${PN} += "python311-hypothesis \
python311-pandas \
python311-pytest \
python311-pytest-asyncio \
python311-pytest-xdist"

inherit rpm
