SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "python310-frozenlist-1.3.3-2.3.aarch64.rpm"
RPM_HASH = "1207a5928b8f1da5b3f2b4ed031db5fa21aa356c69bff1b4201395eae21a592e943d85e4295179d5a5b7d461780b8bbd71f6cfd9743d382e696c6e9eda42555b"

RPROVIDES:${PN} += "python3.10dist-frozenlist \
python310-frozenlist \
python3dist-frozenlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
