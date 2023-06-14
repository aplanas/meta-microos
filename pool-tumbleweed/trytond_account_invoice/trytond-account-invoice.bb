SUMMARY = "The 'account_invoice' module for the Tryton ERP system"
DESCRIPTION = "The account_invoice module add invoices and payment terms."
LICENSE = "GPL-3.0-only"

PV = "6.0.12"

RPM_NAME = "trytond_account_invoice-6.0.12-1.1.noarch.rpm"
RPM_HASH = "659a7a8efa665c14664e5404272ab890e38ddbe550ccc44d88beb5b883b004f133628369f78ba88393f214afff33917bd2eba707f58a03d931be7c625359ae19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trytond-account-invoice \
python3dist-trytond-account-invoice \
trytond-account-invoice"

RDEPENDS:${PN} += "python-abi \
python3-dateutil \
trytond \
trytond-account \
trytond-account-product \
trytond-company \
trytond-currency \
trytond-party \
trytond-product"

inherit rpm
