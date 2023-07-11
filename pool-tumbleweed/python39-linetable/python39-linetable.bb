SUMMARY = "library to manage Python Locations Table (co_linetable)"
DESCRIPTION = "library to manage Python Locations Table (co_linetable)"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-linetable-0.0.3-1.3.noarch.rpm"
RPM_HASH = "c2cd63b9e7b35fe53d8d5009962c080db79e309426a093c34af42db702f279c9589787c157b2c3c215d4a135928bab8b656ecd98f41c656b5217e8920871a767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-linetable \
python39-linetable \
python3dist-linetable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
