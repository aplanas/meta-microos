SUMMARY = "A collection of accessible pygments styles"
DESCRIPTION = "A collection of accessible pygments styles"
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "python311-accessible-pygments-0.0.4-1.4.noarch.rpm"
RPM_HASH = "092f366c1a1bfb29b6bbeeee0116b223d10b4f286e0fbfc3c796859bf22a72779225f922545a5adedf48b38a26b2054d1be6a476d10f0f678c962920032b901a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-accessible-pygments \
python3.11dist-accessible-pygments \
python311-accessible-pygments \
python3dist-accessible-pygments"

RDEPENDS:${PN} += "python-abi \
python311-pygments"

inherit rpm
