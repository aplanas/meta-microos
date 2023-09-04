SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python39-frozenlist-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "d66d35c05da8dc7a046aa5b51576efa51ef423b718e236902bb25f8bccaa113ff5804a2459592fb29fc8bec668e468629c215420699baf74cc668325816a5f6b"

RPROVIDES:${PN} += "python3.9dist-frozenlist \
python39-frozenlist \
python3dist-frozenlist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
