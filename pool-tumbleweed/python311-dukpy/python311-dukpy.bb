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

RPM_NAME = "python311-dukpy-0.3.0-1.7.aarch64.rpm"
RPM_HASH = "22404128d3afa4e53c845b4c010b09eb0235c7784ce0fdcf0d8fd5947884eff67f2c3b3ad12c90182958a7d2ce4837fd34ba225e6708a90a69dc40ec8f51f278"

RPROVIDES:${PN} += "python3-dukpy \
python3.11dist-dukpy \
python311-dukpy \
python3dist-dukpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
