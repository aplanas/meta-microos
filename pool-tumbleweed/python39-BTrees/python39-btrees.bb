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

RPM_NAME = "python39-BTrees-5.0-2.3.aarch64.rpm"
RPM_HASH = "dc9180267b0d6d5a6d6206b9ade0d0846cbd6bf48e778c2178145be603e001b6ac975fe32601ec5a4f15786f85ee5d0d9400cfa4c22483b822f815e5f5ada6db"

RPROVIDES:${PN} += "python3.9dist-btrees \
python39-BTrees \
python39-BTrees-doc \
python3dist-btrees"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-persistent \
python39-zope.interface"

inherit rpm
