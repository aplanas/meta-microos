SUMMARY = "The 'account_invoice_stock' module for the Tryton ERP system"
DESCRIPTION = "This module adds capability to bill stock items/materials"
LICENSE = "GPL-3.0-only"

PV = "6.0.1"

RPM_NAME = "trytond_account_invoice_stock-6.0.1-1.5.noarch.rpm"
RPM_HASH = "5149be786e7a4a7eeb38b6f2a9ec96c61e87307f69805d9082a29fd8d41cc10012a1e402eb93b516aaa4b88b0d28e2258ca4660216fa21acd9785fc0a587201a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-account-invoice-stock \
python3dist-trytond-account-invoice-stock \
trytond-account-invoice-stock"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-account-invoice \
trytond-product \
trytond-stock"

inherit rpm
