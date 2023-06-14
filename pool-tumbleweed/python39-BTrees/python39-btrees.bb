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

RPM_NAME = "python39-BTrees-5.0-1.4.aarch64.rpm"
RPM_HASH = "cd031dbf7c389bca4485d65aa63f961ed86d673d5fa06c92eb93f6505278e9630229eaf2a8a57722db68eb8656f999a0be6c978b5eb048d9fdb45ca38588b332"

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
