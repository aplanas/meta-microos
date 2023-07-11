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

RPM_NAME = "python310-transaction-3.0.1-3.3.noarch.rpm"
RPM_HASH = "4a52fc028a8696c95b9eadc96c3c96539fd56dff73922be7a118413303011989c92cd5299e108c80c86ccd1a9a18cec9d81caf35203d3c18506fc4c2cf26bdd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-transaction \
python310-transaction \
python3dist-transaction"

RDEPENDS:${PN} += "python-abi \
python310-zope.interface"

inherit rpm
