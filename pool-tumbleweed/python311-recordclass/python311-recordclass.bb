SUMMARY = "Library implementing a mutable variant of namedtuple"
DESCRIPTION = "Mutable variant of namedtuple -- recordclass, which support assignments, and \
other memory saving variants."
LICENSE = "MIT"

PV = "0.18.0.1"

RPM_NAME = "python311-recordclass-0.18.0.1-1.7.aarch64.rpm"
RPM_HASH = "604aeb885749df76c83a06a424a00d4df7cd781ba7e374e7b0bce7ab1025f22e83ff5f14421b4860dba6552546a943ded993a6940afd42bd1094d2c3046fff26"

RPROVIDES:${PN} += "python3-recordclass \
python3.11dist-recordclass \
python311-recordclass \
python3dist-recordclass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
