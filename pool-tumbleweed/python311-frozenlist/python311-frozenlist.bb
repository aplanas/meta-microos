SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "python311-frozenlist-1.3.3-2.1.aarch64.rpm"
RPM_HASH = "1dedc6215db0bfb2670037f9d59690f6562987223f4348ee1db953f8f58f0ac86d0d8a27e4fd047da18a2b56c85ab5a09bc8f81f6c19438b510270ea5f7dcc0b"

RPROVIDES:${PN} += "python3.11dist(frozenlist) \
python311-frozenlist \
python311-frozenlist(aarch-64) \
python3dist(frozenlist)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
