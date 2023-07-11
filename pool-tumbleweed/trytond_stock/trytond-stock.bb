SUMMARY = "The 'stock' module for the Tryton ERP system"
DESCRIPTION = "The stock module defines fundamentals for all stock management \
situations: Locations where product are stored, moves between these \
locations, shipments for product arrivals and departures and \
inventory to control and update stock levels."
LICENSE = "GPL-3.0-only"

PV = "6.0.20"

RPM_NAME = "trytond_stock-6.0.20-1.1.noarch.rpm"
RPM_HASH = "22c31697dca4dbe32dc3f8f1c4be813afc86d8270cc2e13996fb4580e635a30a6c0e537316c77731a876eb12cb2760e6905d1905a11bd0477bcce4ff0a5415cf"
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
