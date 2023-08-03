SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.2.1.2"

RPM_NAME = "python311-cPyparsing-2.4.7.2.1.2-1.1.aarch64.rpm"
RPM_HASH = "acffba9b863725df1f3e7c3031b8d338e59ebeeb60824b2ac8f2e7e3ccfcb289e803325bf55231556f4819aaeed89eb2c6cb78f5c0c8525cff7fba4b4b51d206"

RPROVIDES:${PN} += "python3-cPyparsing \
python3.11dist-cpyparsing \
python311-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
