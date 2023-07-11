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

RPM_NAME = "python310-BTrees-5.0-2.3.aarch64.rpm"
RPM_HASH = "90aa5382e3e51476059ed138dab0981d8e660ad7b99b7d33dcbc4ed7e11d32b8ce355659183ec4acbf95f844a46df9cf4cd789e51b4432ea786d3a0acfe9eb7e"

RPROVIDES:${PN} += "python3.10dist-btrees \
python310-BTrees \
python310-BTrees-doc \
python3dist-btrees"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-persistent \
python310-zope.interface"

inherit rpm
