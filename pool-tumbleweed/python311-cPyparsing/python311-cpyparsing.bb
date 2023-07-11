SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.1.2.1"

RPM_NAME = "python311-cPyparsing-2.4.7.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "7140fd8f9f4437fd4eff89bd6a1e34cfc8466bd9b5b1d758bdd94c8339fa8cd5856a2dfd414888c86352f803c56e7a0d74d36d51251956b6ad99696587fd612b"

RPROVIDES:${PN} += "python3-cPyparsing \
python3.11dist-cpyparsing \
python311-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
