SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python311-frozenlist-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "75d908e636fc05330173ca2681b066b4bcbfa8d1b70b37504887e2d22a44bf3071279f16466e176b0c35fb1d19d22022fd7680aca83db4dbafadd85db9e78815"

RPROVIDES:${PN} += "python3-frozenlist \
python3.11dist-frozenlist \
python311-frozenlist \
python3dist-frozenlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
