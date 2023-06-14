SUMMARY = "JavaScript in Python"
DESCRIPTION = "DukPy is a JavaScript runtime environment for Python using the duktape \
embeddable JavaScript engine. With dukpy, you can run JavaScript in \
Python."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python39-dukpy-kovidgoyal-0.3-3.11.aarch64.rpm"
RPM_HASH = "5c4c6135fa5738d176c665efe8effe41c039adb152de41a22847e37cc9b86d0fb3fe3ab5dbc192645f79e2792dcc9c9dff630982acc0acc2169fa25fbbf9ca43"

RPROVIDES:${PN} += "python3.9dist-dukpy \
python39-dukpy-kovidgoyal \
python3dist-dukpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
