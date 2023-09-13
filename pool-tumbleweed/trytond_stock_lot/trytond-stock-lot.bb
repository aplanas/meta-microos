SUMMARY = "The 'stock_lot' module of the Tryton ERP system"
DESCRIPTION = "The stock lot module defines lot of products. \
A lot is by default just a number to tag moves. It is possible to define per product when the lot is required by selecting the type of location involved in the move."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.1"

RPM_NAME = "trytond_stock_lot-6.0.1-1.1.noarch.rpm"
RPM_HASH = "09f404baf7eaf97505940f0d2634f2d869f7533b63d4455163a72a589f794a329ac0b115be6ed36a7e4ea3de617743e8b246e5eb4226f6ca879d79d0545a66b4"
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
