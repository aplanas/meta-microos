SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "python39-frozenlist-1.3.3-2.3.aarch64.rpm"
RPM_HASH = "c0783789baf1ec628bff75bfeb9e431ce26a72cd3d0558ba9cb4aba6b974945b5bcbacf197c9178b82b2fa92c22f7dbdbbe7fbdc01e78b3e2fe1a93a5c6a0b4e"

RPROVIDES:${PN} += "python3.9dist-frozenlist \
python39-frozenlist \
python3dist-frozenlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
