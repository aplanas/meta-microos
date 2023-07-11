SUMMARY = "The 'account_product' module of the Tryton ERP system"
DESCRIPTION = "The account_product module of the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "trytond_account_product-6.0.3-1.8.noarch.rpm"
RPM_HASH = "351ac6db498c62174ba4448da570a3fecc1c56c769c120cbf7104c8de5952c9b5377da238a44c476163d13ea1eedf4a51613dc5934289f15fa6cdb32bbcd6e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-account-product \
python3dist-trytond-account-product \
trytond-account-product"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-account \
trytond-company \
trytond-product"

inherit rpm
