SUMMARY = "JavaScript interpreter for Python"
DESCRIPTION = "DukPy is a javascript interpreter for Python built on top of \
duktape engine. \
It comes with a bunch of common transpilers built-in for convenience: \
 \
    - CoffeeScript \
    - BabelJS \
    - TypeScript \
    - JSX \
    - LESS"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-dukpy-0.3.0-1.7.aarch64.rpm"
RPM_HASH = "e5453fd966db01a5d25f627135cc4d04c7ecdae8d4c339aac929e152988165ac32b84c8510997a7f76cec413af3727c98d9eb2b9342fa9b9a933cd45d4259c27"

RPROVIDES:${PN} += "python3.10dist-dukpy \
python310-dukpy \
python3dist-dukpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
