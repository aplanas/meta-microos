SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-httptools-0.5.0-3.1.aarch64.rpm"
RPM_HASH = "9e1e73d289e6dae79ea93ca0dfed31cb05514c4fa1dffc761a853b824dcc1a8a52303cb66dbbaf5215917326e1e31fe639024b54856e6e5bf340363e6ccdeef1"

RPROVIDES:${PN} += "python3-httptools \
python3.11dist-httptools \
python311-httptools \
python3dist-httptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
