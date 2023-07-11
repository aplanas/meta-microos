SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "python311-frozenlist-1.3.3-2.3.aarch64.rpm"
RPM_HASH = "4548f0b20c2687da265e5af3c1edd2f3ba4ece4bc35ed7ccfdedd3620d64e7d45b663dced00d1e34a5c641e5f724de889ef30f3043295a93efc98d3b359be9af"

RPROVIDES:${PN} += "python3-frozenlist \
python3.11dist-frozenlist \
python311-frozenlist \
python3dist-frozenlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
