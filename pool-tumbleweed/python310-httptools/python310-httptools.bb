SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-httptools-0.5.0-3.1.aarch64.rpm"
RPM_HASH = "d72e141284b68e536974d611fea23158a00d9dfd4f13fb3c516933211d4696ab924831281bb015eeee9e5ea53c012f3fd393c68fedac9812155962eba34ec9eb"

RPROVIDES:${PN} += "python3.10dist-httptools \
python310-httptools \
python3dist-httptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
