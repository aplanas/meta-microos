SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python311-progress-1.6-2.1.noarch.rpm"
RPM_HASH = "5717703f4e8af667af99337215079be97b111671443dcdfa4e324202377845cf675d8084101f370243b403ba11822e69bf182abc71bce3bbe455844bc397fac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progress \
python3.11dist-progress \
python311-progress \
python3dist-progress"

RDEPENDS:${PN} += "python-abi"

inherit rpm
