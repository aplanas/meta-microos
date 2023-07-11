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

RPM_NAME = "python311-transaction-3.0.1-3.3.noarch.rpm"
RPM_HASH = "731811a992183e475e056a8ff41abd52e923c5c5f7be24cb69998dc2a07ce6bdea162c3c3281dbf23a7f64d816b96ed53f939b11eacc248ae0ff12ddbe654fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transaction \
python3.11dist-transaction \
python311-transaction \
python3dist-transaction"

RDEPENDS:${PN} += "python-abi \
python311-zope.interface"

inherit rpm
