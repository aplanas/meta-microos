SUMMARY = "The 'account_invoice_stock' module for the Tryton ERP system"
DESCRIPTION = "This module adds capability to bill stock items/materials"
LICENSE = "GPL-3.0-only"

PV = "6.0.2"

RPM_NAME = "trytond_account_invoice_stock-6.0.2-1.1.noarch.rpm"
RPM_HASH = "625f7af96c35f4491916be5acebec13e06c7db9688c18a20dcfa616663de2280157d3f838a54580ae5310ea2d6adf59a277a8d924dc60fa4c31c5cb8a520b8d6"
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
