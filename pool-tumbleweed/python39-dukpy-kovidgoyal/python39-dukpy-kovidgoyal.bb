SUMMARY = "JavaScript in Python"
DESCRIPTION = "DukPy is a JavaScript runtime environment for Python using the duktape \
embeddable JavaScript engine. With dukpy, you can run JavaScript in \
Python."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python39-dukpy-kovidgoyal-0.3-4.1.aarch64.rpm"
RPM_HASH = "35c868199fc9e0f4e240435811f9f6d8e4f8c7ee08a487c5950f19af526e594c99cecc8d33ae96475525972a6573e37fa221397c46909419f9033d8e568c63a5"

RPROVIDES:${PN} += "python3.9dist-dukpy \
python39-dukpy-kovidgoyal \
python3dist-dukpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
