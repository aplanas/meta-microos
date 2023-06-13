SUMMARY = "The 'stock_lot' module of the Tryton ERP system"
DESCRIPTION = "The stock lot module defines lot of products. \
A lot is by default just a number to tag moves. It is possible to define per product when the lot is required by selecting the type of location involved in the move."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.0"

RPM_NAME = "trytond_stock_lot-6.0.0-1.7.noarch.rpm"
RPM_HASH = "8f406be05b0e29d12a828151cff1512c822201196f2675565ae723d9413edf9ac742da30580db51b9765b1b26d0dabc1685a684183188122fc2779c17b73f15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-stock-lot) \
python3dist(trytond-stock-lot) \
trytond_stock_lot"

RDEPENDS:${PN} += "python(abi) \
trytond \
trytond_company \
trytond_currency \
trytond_party \
trytond_product \
trytond_stock"

inherit rpm
