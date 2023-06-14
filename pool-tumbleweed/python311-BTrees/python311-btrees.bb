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

RPM_NAME = "python311-BTrees-5.0-1.4.aarch64.rpm"
RPM_HASH = "5ce53825b18c62115b17419c42d050f248a62fb4c3cd8f939f83d6f889f8eb3007f0504204c3e072a4d5e74a890d703cda4effd582f3408ce9bb3c7a39e0539f"

RPROVIDES:${PN} += "python3.11dist-btrees \
python311-BTrees \
python311-BTrees-doc \
python3dist-btrees"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-persistent \
python311-zope.interface"

inherit rpm
