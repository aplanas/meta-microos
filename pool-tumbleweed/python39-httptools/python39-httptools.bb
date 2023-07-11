SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-httptools-0.5.0-2.3.aarch64.rpm"
RPM_HASH = "be0da281cd6dec76e3e91a7baefd7ad656994a3e45ed84752ffeffcf9acb5ec2784a0688f682250a33d1da8be9a3b22bdaa22d3890943400d3fa11c32a6630c1"

RPROVIDES:${PN} += "python3.9dist-httptools \
python39-httptools \
python3dist-httptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
