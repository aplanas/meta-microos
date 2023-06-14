SUMMARY = "Secure HTTP request signing using the HTTP Signature draft specification"
DESCRIPTION = "Secure HTTP request signing using the HTTP Signature draft specification"
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python310-httpsig_cffi-15.0.0-3.4.noarch.rpm"
RPM_HASH = "1c11bd416ec30cb54f48451942e58f6c85a1c3a6b29bc06d18e3504d20f75d0941ef74d5e19a047ffc566820dfb4ba00e5156f47f944d3d1200d6bf12da99d4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpsig-cffi \
python3.10dist-httpsig-cffi \
python310-httpsig-cffi \
python3dist-httpsig-cffi"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-requests \
python310-six"

inherit rpm
