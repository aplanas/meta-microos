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

RPM_NAME = "python310-dukpy-0.3.0-1.5.aarch64.rpm"
RPM_HASH = "4373b0cf090dba08741d5784a7451c2ba56835b6b4bf8cfbfd0d1c00336441b79f900a69e00a9604b775275a7d939197a8522e11c555f73127b32b7bf7cfbea7"

RPROVIDES:${PN} += "python3-dukpy \
python3.10dist(dukpy) \
python310-dukpy \
python310-dukpy(aarch-64) \
python3dist(dukpy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
