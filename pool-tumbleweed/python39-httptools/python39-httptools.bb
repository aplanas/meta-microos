SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-httptools-0.5.0-3.1.aarch64.rpm"
RPM_HASH = "44b9a75fabdfbdb363a799861a64bbdb280aae2993b5600cafdee034916800e0197030a2781d34b89c66eb87ed902914aeecf66b464e506f4e00fbcb23712be8"

RPROVIDES:${PN} += "python3.9dist-httptools \
python39-httptools \
python3dist-httptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
