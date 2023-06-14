SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "python311-pytest-regressions-2.4.2-3.1.noarch.rpm"
RPM_HASH = "5cb44ed4d75d69916c715aea88528b4fd2258fdcafa52913ec0534ae3f6fea469c1beca22455cf1834eeb112dfc2f911d03676d5aa1d6464f07905b9f9b5d8b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-regressions \
python311-pytest-regressions \
python3dist-pytest-regressions"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-pytest \
python311-pytest-datadir"

inherit rpm
