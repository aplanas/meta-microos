SUMMARY = "The 'account' module for the Tryton ERP system"
DESCRIPTION = "The accounting module of the Tryton application platform. \
It defines fundamentals for most of accounting needs, such as fiscal year, \
period, account type, journal, tax code and more."
LICENSE = "GPL-3.0+"

PV = "6.0.17"

RPM_NAME = "trytond_account-6.0.17-1.2.noarch.rpm"
RPM_HASH = "3b9afa9ffbdf6a7a404c9483797e822cd94d619e92c022cb3edaf2717809210391563820d5c2cceeb3f7235461231c9a9b0a52333bf5f3e502660e7730166576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-account \
python3dist-trytond-account \
trytond-account"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-company \
trytond-currency \
trytond-party"

inherit rpm
