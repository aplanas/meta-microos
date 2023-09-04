SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python310-frozenlist-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "133d4f78e4015021a1d39640fe20a918146a14cf9152ed5bf0e0be7e1f0573ceee2013150bd707868392c835feca15e93db1ffc65e4a97d7627726983f8720ad"

RPROVIDES:${PN} += "python3.10dist-frozenlist \
python310-frozenlist \
python3dist-frozenlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
