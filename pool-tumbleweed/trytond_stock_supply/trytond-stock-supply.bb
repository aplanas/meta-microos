SUMMARY = "The Stock Supply module for the Tryton ERP system"
DESCRIPTION = "The Stock Supply module adds automatic supply mechanisms and \
introduce the concepts of order point and purchase request into the \
Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.6"

RPM_NAME = "trytond_stock_supply-6.0.6-1.2.noarch.rpm"
RPM_HASH = "e757e1af9647b9bf6512bc0b7589e2dda302101dc0c78ffa6e7dea509ef44122f109faf36a48f25870b6b81a521bb5803156895850ae8ae02053cec4af106a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-stock-supply \
python3dist-trytond-stock-supply \
trytond-stock-supply"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-account \
trytond-party \
trytond-product \
trytond-purchase \
trytond-stock"

inherit rpm
