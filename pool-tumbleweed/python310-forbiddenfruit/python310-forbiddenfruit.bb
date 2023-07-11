SUMMARY = "Python module to patch python built-in objects"
DESCRIPTION = "This project allows you to patch built-in objects, declared in C through \
python."
LICENSE = "GPL-3.0-only | MIT"

PV = "0.1.3"

RPM_NAME = "python310-forbiddenfruit-0.1.3-2.19.aarch64.rpm"
RPM_HASH = "39998ca0ffb1fa8eff60f882adbc176c4ed0db9d52e6faa000c277bbbcbf0fb5abb50675ee6c61747d40d9e11d3b27e7bb49d6f70e3cb882b78a35aa310214b7"

RPROVIDES:${PN} += "python3.10dist-forbiddenfruit \
python310-forbiddenfruit \
python3dist-forbiddenfruit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
