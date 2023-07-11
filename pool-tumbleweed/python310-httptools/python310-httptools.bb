SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-httptools-0.5.0-2.3.aarch64.rpm"
RPM_HASH = "b9945dfed55060c4d8f785c20da2440ae63c8ba953d2b75d6b8af479241e8656dd9f7c2ba3e1494ed99dc14fd6821c9b9d93b2e9a69f4e0319b4f98bbc773f0d"

RPROVIDES:${PN} += "python3.10dist-httptools \
python310-httptools \
python3dist-httptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
