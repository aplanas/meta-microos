SUMMARY = "The 'purchase' module for the Tryton ERP system"
DESCRIPTION = "The purchase module defines the Purchase model in the Tryton \
application platform. The purchase is mainly defined by a party from \
which the products will be purchased and a list of purchase lines, \
each one containing a product and a quantity."
LICENSE = "GPL-3.0"

PV = "6.0.11"

RPM_NAME = "trytond_purchase-6.0.11-1.1.noarch.rpm"
RPM_HASH = "f97ac297a87455824b8504892fa684438765d6b77650446e458ef9a741b397ec133914504463de67a41b275ddb96ab7fb54fb92740b4177c459435552b7940bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-purchase) \
python3dist(trytond-purchase) \
trytond_purchase"

RDEPENDS:${PN} += "python(abi) \
trytond \
trytond_account \
trytond_account_invoice \
trytond_account_product \
trytond_company \
trytond_currency \
trytond_party \
trytond_product \
trytond_stock"

inherit rpm
