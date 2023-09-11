SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-test-2.0.3-1.3.noarch.rpm"
RPM_HASH = "d51647ff84142e14a6fb2c730d96798007eb46d8ef19e09ea390e0334c51183448d21635ddf33e534db3dcb4867637becb8311222ae19e77c8e7a05725def3c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-test \
python311-pandas-test"

RDEPENDS:${PN} += "python311-hypothesis \
python311-pandas \
python311-pytest \
python311-pytest-asyncio \
python311-pytest-xdist"

inherit rpm
