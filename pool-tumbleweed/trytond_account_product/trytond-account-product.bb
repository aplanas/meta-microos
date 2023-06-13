SUMMARY = "The 'account_product' module of the Tryton ERP system"
DESCRIPTION = "The account_product module of the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "trytond_account_product-6.0.3-1.7.noarch.rpm"
RPM_HASH = "eb7105136d1cba7aaef5d99cfb3ba4effe9245931d992e3da44e5c76847aa7dd82744605a80a361bf9a78493574503023902f04691a960eb920a625c659cfc6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-account-product) \
python3dist(trytond-account-product) \
trytond_account_product"

RDEPENDS:${PN} += "python(abi) \
trytond \
trytond_account \
trytond_company \
trytond_product"

inherit rpm
