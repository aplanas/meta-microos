SUMMARY = "The 'stock_lot' module of the Tryton ERP system"
DESCRIPTION = "The stock lot module defines lot of products. \
A lot is by default just a number to tag moves. It is possible to define per product when the lot is required by selecting the type of location involved in the move."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.0"

RPM_NAME = "trytond_stock_lot-6.0.0-1.8.noarch.rpm"
RPM_HASH = "c9e3bc96330ee891074453ff7d32140a43db420f06af3c00f057351449b799e95377fb6f92619520eaf6201165d6850da064698b018d4b2d58415565579c3145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-stock-lot \
python3dist-trytond-stock-lot \
trytond-stock-lot"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-company \
trytond-currency \
trytond-party \
trytond-product \
trytond-stock"

inherit rpm
