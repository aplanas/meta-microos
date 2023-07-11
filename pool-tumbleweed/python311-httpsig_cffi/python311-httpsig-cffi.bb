SUMMARY = "Secure HTTP request signing using the HTTP Signature draft specification"
DESCRIPTION = "Secure HTTP request signing using the HTTP Signature draft specification"
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python311-httpsig_cffi-15.0.0-3.6.noarch.rpm"
RPM_HASH = "9a3367783bb6cfc54842b74047e9a95131cf83d11a1f510158d1bdea6c24c124005f058c722097d0114d958d29da929f5d4fa943553a642ccbbc1405d0efda74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpsig-cffi \
python3.11dist-httpsig-cffi \
python311-httpsig-cffi \
python3dist-httpsig-cffi"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-requests \
python311-six"

inherit rpm
