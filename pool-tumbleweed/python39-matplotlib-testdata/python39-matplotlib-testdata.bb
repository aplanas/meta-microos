SUMMARY = "Test data for python39-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-testdata-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "a00a85071aee2f908be2d8c5841842eb8d25f59237aab9dc62e4580948d235fa9ef246b4cbec4f421c6fa114891ad45458ddccb0c55170e9dcad69d823bc3480"

RPROVIDES:${PN} += "python39-matplotlib-testdata \
python39-matplotlib-testdata(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python39-matplotlib"

inherit rpm
