SUMMARY = "The 'stock' module for the Tryton ERP system"
DESCRIPTION = "The stock module defines fundamentals for all stock management \
situations: Locations where product are stored, moves between these \
locations, shipments for product arrivals and departures and \
inventory to control and update stock levels."
LICENSE = "GPL-3.0-only"

PV = "6.0.19"

RPM_NAME = "trytond_stock-6.0.19-1.1.noarch.rpm"
RPM_HASH = "69d40dc4682f2a953da5a13067527734b2d15a7214bdfa1255559c109ace4d18d55715250ba69018315e2a22e5fb0dacda337692ff679f81b916553cbbfc1ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-stock) \
python3dist(trytond-stock) \
trytond_stock"

RDEPENDS:${PN} += "python(abi) \
trytond \
trytond_company \
trytond_currency \
trytond_party \
trytond_product"

inherit rpm
