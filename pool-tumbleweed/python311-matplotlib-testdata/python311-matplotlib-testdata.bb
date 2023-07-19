SUMMARY = "Test data for python311-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-testdata-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "a48de1db921ec206dcf15fd2938bc9488aff044c220ac4f0610d58c0f6526b91550a8c13ff3a8e0c58c216f8445b1618a3c502caadb04ed3168f65b31b47afee"

RPROVIDES:${PN} += "python3-matplotlib-testdata \
python311-matplotlib-testdata"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib"

inherit rpm
