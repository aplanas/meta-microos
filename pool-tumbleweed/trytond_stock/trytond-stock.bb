SUMMARY = "The 'stock' module for the Tryton ERP system"
DESCRIPTION = "The stock module defines fundamentals for all stock management \
situations: Locations where product are stored, moves between these \
locations, shipments for product arrivals and departures and \
inventory to control and update stock levels."
LICENSE = "GPL-3.0-only"

PV = "6.0.21"

RPM_NAME = "trytond_stock-6.0.21-1.1.noarch.rpm"
RPM_HASH = "0c8604d4121b33b223311eb526fb2d111986c12c436a94776bcaf641cd3df3e4db18fef955c85fa9f065b1c85f4128fed254f973224d9267ad9a6c439b71e5ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-stock \
python3dist-trytond-stock \
trytond-stock"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-company \
trytond-currency \
trytond-party \
trytond-product"

inherit rpm
