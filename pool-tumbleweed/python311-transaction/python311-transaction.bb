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

RPM_NAME = "python311-transaction-3.0.1-2.5.noarch.rpm"
RPM_HASH = "769f504561f9efe46268009236ff11e44bf08171e1f56354e5fb4d63b476599a85f5159bce119edaed32ab4b6a6f95f1400b1572560f6a3ea66b9592f038986c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-transaction \
python311-transaction \
python3dist-transaction"

RDEPENDS:${PN} += "python-abi \
python311-zope.interface"

inherit rpm
