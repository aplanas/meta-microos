SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.1.2.1"

RPM_NAME = "python310-cPyparsing-2.4.7.1.2.1-1.1.aarch64.rpm"
RPM_HASH = "ba23a2a85eeae86ca9778be37df2abf29c50a054e38207a8d519b2abc59c5f99e7535e86415ce524b9ef7c3b61c5c5721e3a0bacfbccae362247e75eb6272382"

RPROVIDES:${PN} += "python3-cPyparsing \
python3.10dist-cpyparsing \
python310-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
