SUMMARY = "JavaScript in Python"
DESCRIPTION = "DukPy is a JavaScript runtime environment for Python using the duktape \
embeddable JavaScript engine. With dukpy, you can run JavaScript in \
Python."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python310-dukpy-kovidgoyal-0.3-4.1.aarch64.rpm"
RPM_HASH = "d2cd510e1391105b34f784ed04aae1e68c6765866fe7e1c10c8c8161d2767387478b3f18c0811cf4df61ea6cca7123e937c7a244bab656f7e0f326625ea40981"

RPROVIDES:${PN} += "python3.10dist-dukpy \
python310-dukpy-kovidgoyal \
python3dist-dukpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
