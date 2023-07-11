SUMMARY = "Persistent B-tree object containers for Python"
DESCRIPTION = "This package contains a generic BTrees implementation for Python. It is \
mainly used by the ZODB, though. \
 \
Note that the data manager API, BTrees.interfaces.IDataManager, is \
syntactically simple, but semantically complex. The semantics were not easy to \
express in the interface. This could probably use more work. The semantics are \
presented in detail through examples of a sample data manager in \
BTrees.tests.test_SampleDataManager."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-BTrees-5.0-2.3.aarch64.rpm"
RPM_HASH = "c05b37dd173860d8c8214844114047cdc7aaae7916b3f6a0f10623cda4db550c7b815c4d148acda7a20384de114d1708f8976f0c198190d5b8c388c2fe7c5219"

RPROVIDES:${PN} += "python3-BTrees \
python3-BTrees-doc \
python3.11dist-btrees \
python311-BTrees \
python311-BTrees-doc \
python3dist-btrees"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-persistent \
python311-zope.interface"

inherit rpm
