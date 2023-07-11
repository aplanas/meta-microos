SUMMARY = "The 'account_invoice' module for the Tryton ERP system"
DESCRIPTION = "The account_invoice module add invoices and payment terms."
LICENSE = "GPL-3.0-only"

PV = "6.0.12"

RPM_NAME = "trytond_account_invoice-6.0.12-1.2.noarch.rpm"
RPM_HASH = "44e975f91273ad286cf598800d00d1fcf8a458388bd0edc13b4b9ce1a047dd2d0a67fa202383cfd0b55b7384734e834d6a8e860fd7f89bb16f95a9cecf7969cb"
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
