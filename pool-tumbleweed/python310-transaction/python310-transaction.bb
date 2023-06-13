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

RPM_NAME = "python310-transaction-3.0.1-2.5.noarch.rpm"
RPM_HASH = "e5f77cd391220f5b5c36d15f94ddd2a50c58c17c5b1b0eeb27bb58102114ac3f968cf3df6466561d964811cfa7441c238de398b5ee179da80189fb8c3c23e466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transaction \
python3.10dist(transaction) \
python310-transaction \
python3dist(transaction)"

RDEPENDS:${PN} += "python(abi) \
python310-zope.interface"

inherit rpm
