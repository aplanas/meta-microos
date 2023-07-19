SUMMARY = "Test data for python310-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-testdata-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "b102b095c250871682b7e2682f0790fc96f606c7b088818fa1cf531fa2a99c4c68692d871b930e3ba96219c19c2d114af87a000a3b757a1af116a16a4c9be1ff"

RPROVIDES:${PN} += "python310-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib"

inherit rpm
