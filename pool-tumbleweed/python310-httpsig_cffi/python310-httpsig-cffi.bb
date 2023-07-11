SUMMARY = "Secure HTTP request signing using the HTTP Signature draft specification"
DESCRIPTION = "Secure HTTP request signing using the HTTP Signature draft specification"
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python310-httpsig_cffi-15.0.0-3.6.noarch.rpm"
RPM_HASH = "4060409a43d6d30c9da2f4f54a1133dac30f60c9610067f9dd64e6ae913fedb058efaa0b0445939ebb67bf2bdaf5da45e12ec61695b933c9e02c7ec985862c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httpsig-cffi \
python310-httpsig-cffi \
python3dist-httpsig-cffi"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-requests \
python310-six"

inherit rpm
