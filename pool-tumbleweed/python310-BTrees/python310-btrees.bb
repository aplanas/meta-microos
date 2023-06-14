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

RPM_NAME = "python310-BTrees-5.0-1.4.aarch64.rpm"
RPM_HASH = "e144cd283e708fb311e181aab9c775fae572236512889ed15c5aa2fb75469ee8909ef638a3041b9adf14d47bfd994d249ba7201af2f6e07e4cede10e2ada73d1"

RPROVIDES:${PN} += "python3-BTrees \
python3-BTrees-doc \
python3.10dist-btrees \
python310-BTrees \
python310-BTrees-doc \
python3dist-btrees"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-persistent \
python310-zope.interface"

inherit rpm
