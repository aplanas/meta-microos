SUMMARY = "Test data for python310-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-testdata-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "856a802bd6eb14737b149319bbf5cf6a1cc866701e802e6912ba16c9fea7d92b35bd93cb295a20bd1d569ec549f85728cf291f1ba93f420069f2e89fc7dfc249"

RPROVIDES:${PN} += "python310-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib"

inherit rpm
