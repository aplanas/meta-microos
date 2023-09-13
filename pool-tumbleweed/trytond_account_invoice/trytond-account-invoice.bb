SUMMARY = "The 'account_invoice' module for the Tryton ERP system"
DESCRIPTION = "The account_invoice module add invoices and payment terms."
LICENSE = "GPL-3.0-only"

PV = "6.0.13"

RPM_NAME = "trytond_account_invoice-6.0.13-1.1.noarch.rpm"
RPM_HASH = "e519fb8847fcc50ae9e0a048bbec521db69f7099989240078522cf889c4103915d5e771e6826a41d5f11c6648f460b0bf49cbd4ca96b27c6359bd3623472bc43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-account-invoice \
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
