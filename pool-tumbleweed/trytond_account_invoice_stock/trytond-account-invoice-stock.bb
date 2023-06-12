SUMMARY = "The 'account_invoice_stock' module for the Tryton ERP system"
DESCRIPTION = "This module adds capability to bill stock items/materials"
LICENSE = "GPL-3.0-only"

PV = "6.0.1"

RPM_NAME = "trytond_account_invoice_stock-6.0.1-1.4.noarch.rpm"
RPM_HASH = "b7c541ba21c06316cfe1cc971efaea35d4739d9809f802e086af73b42a538b8d7db5246efc6e9ab7a90c3f19e097ec622a573dc0b41d432e0f54dff0c4ed95b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-account-invoice-stock) \
python3dist(trytond-account-invoice-stock) \
trytond_account_invoice_stock"
RDEPENDS:${PN} += "python(abi) \
trytond \
trytond_account_invoice \
trytond_product \
trytond_stock"

inherit rpm
