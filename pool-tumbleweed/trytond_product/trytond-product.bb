SUMMARY = "The 'product' module for the Tryton ERP system"
DESCRIPTION = "The Product module defines the following models in the Tryton \
application platform: Category of Unit of Measure, Unit of Measure, \
Product Template, Product and Product Category."
LICENSE = "GPL-3.0-only"

PV = "6.0.4"

RPM_NAME = "trytond_product-6.0.4-1.2.noarch.rpm"
RPM_HASH = "995b49e4dc11387ca8b856b9ecb03116863062315d2f5663f3bf4321425505d0cba3d40efc28207efc281157a29ae00587daae4adfb9b77257acac2c78ccdb89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-product \
python3dist-trytond-product \
trytond-product"

RDEPENDS:${PN} += "python-abi \
trytond"

inherit rpm
