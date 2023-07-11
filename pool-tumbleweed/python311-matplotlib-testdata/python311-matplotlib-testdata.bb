SUMMARY = "Test data for python311-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-testdata-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "ae78429b7e6ac87e644ae90714d409b7e02423256c1392003a3dd3f43cd7bb59383e094c1cf968323e078274e4f900e31bbb4b6806384c922ef9de7ef1df11a9"

RPROVIDES:${PN} += "python3-matplotlib-testdata \
python311-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib"

inherit rpm
