SUMMARY = "Data-Driven/Decorated Tests"
DESCRIPTION = "A library to multiply test cases."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-ddt-1.6.0-3.3.noarch.rpm"
RPM_HASH = "414aa087fabc2c10e701538c51eef5b8bd7eef08c448dd11f7eaac74ee9b03d788f580b08bb41d0da6addda377fb0681314a8f474d8d5ab3e89efd9e23c40261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ddt \
python310-ddt \
python3dist-ddt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
