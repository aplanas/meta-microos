SUMMARY = "JavaScript in Python"
DESCRIPTION = "DukPy is a JavaScript runtime environment for Python using the duktape \
embeddable JavaScript engine. With dukpy, you can run JavaScript in \
Python."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python311-dukpy-kovidgoyal-0.3-4.1.aarch64.rpm"
RPM_HASH = "79205bb60e809ba37daa7e0abe13555619b727871548aa59793272c2e1c03190680213f8dc9c9d00f6d481fbfd6a8e063f4bc2d6c3209f7d07b44b9a006a58c6"

RPROVIDES:${PN} += "python3-dukpy-kovidgoyal \
python3.11dist-dukpy \
python311-dukpy-kovidgoyal \
python3dist-dukpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
