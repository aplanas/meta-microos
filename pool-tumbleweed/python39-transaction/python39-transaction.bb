SUMMARY = "Transaction management for Python"
DESCRIPTION = "This package contains a generic transaction implementation for Python. It is \
mainly used by the ZODB, though. \
 \
Note that the data manager API, transaction.interfaces.IDataManager, is \
syntactically simple, but semantically complex. The semantics were not easy to \
express in the interface. This could probably use more work. The semantics are \
presented in detail through examples of a sample data manager in \
transaction.tests.test_SampleDataManager."
LICENSE = "ZPL-2.1"

PV = "3.0.1"

RPM_NAME = "python39-transaction-3.0.1-2.5.noarch.rpm"
RPM_HASH = "a9cda945da7883adf70a44eeaff8d6812e4cb6cd6d27302b726c4f92a44cc7c5966c46cfb26385ed0cbc707c846d9c078aaa97c3b199a3a8d33595ad833530f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(transaction) \
python39-transaction \
python3dist(transaction)"
RDEPENDS:${PN} += "python(abi) \
python39-zope.interface"

inherit rpm
