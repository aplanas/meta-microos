SUMMARY = "The 'purchase' module for the Tryton ERP system"
DESCRIPTION = "The purchase module defines the Purchase model in the Tryton \
application platform. The purchase is mainly defined by a party from \
which the products will be purchased and a list of purchase lines, \
each one containing a product and a quantity."
LICENSE = "GPL-3.0"

PV = "6.0.11"

RPM_NAME = "trytond_purchase-6.0.11-1.2.noarch.rpm"
RPM_HASH = "bd228305175b751bc8c5c6dc24d8600f9dd664350e93d240386c60b6ec75804cefa17e24efcd474b7a783cf8ad8dcb51a533e3bb1b7d052a8c464633a4fff46b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-purchase \
python3dist-trytond-purchase \
trytond-purchase"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-account \
trytond-account-invoice \
trytond-account-product \
trytond-company \
trytond-currency \
trytond-party \
trytond-product \
trytond-stock"

inherit rpm
