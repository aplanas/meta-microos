SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-test-2.1.0-1.2.noarch.rpm"
RPM_HASH = "c0724918d818bf63144545f214ee06e22f7b95ff89add22fc308ea3f1be1f43de0db2e9dada58647f270fa335d69a7763fe574421cf6488ec85b78e60f1d045e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-test \
python311-pandas-test"

RDEPENDS:${PN} += "python311-hypothesis \
python311-pandas \
python311-pytest \
python311-pytest-asyncio \
python311-pytest-xdist"

inherit rpm
