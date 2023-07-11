SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-test-2.0.2-4.1.noarch.rpm"
RPM_HASH = "5c8997afb4d0034a78615234aef0cd7b6540945df5549fa746bd691ed5eff4d2cdf25a554bdeaa7304f1a9c61ad476517f3c04f90499d0ae0d0e99b6dbedfe67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-test \
python311-pandas-test"

RDEPENDS:${PN} += "python311-hypothesis \
python311-pandas \
python311-pytest \
python311-pytest-asyncio \
python311-pytest-xdist"

inherit rpm
