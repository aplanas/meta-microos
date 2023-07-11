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

RPM_NAME = "python39-transaction-3.0.1-3.3.noarch.rpm"
RPM_HASH = "5069a6cd49624590c6579145e336162c36c22b4ca130ac4c5015fae99a59c38b5ab4bccea1b9ed528e7b7391ecb106c022aae788f7a4cd9aa6cc5d5ec425f3cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-transaction \
python39-transaction \
python3dist-transaction"

RDEPENDS:${PN} += "python-abi \
python39-zope.interface"

inherit rpm
