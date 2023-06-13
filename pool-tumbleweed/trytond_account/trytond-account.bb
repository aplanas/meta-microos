SUMMARY = "The 'account' module for the Tryton ERP system"
DESCRIPTION = "The accounting module of the Tryton application platform. \
It defines fundamentals for most of accounting needs, such as fiscal year, \
period, account type, journal, tax code and more."
LICENSE = "GPL-3.0+"

PV = "6.0.17"

RPM_NAME = "trytond_account-6.0.17-1.1.noarch.rpm"
RPM_HASH = "7f7b7e7d32990478e97212490481e92039e1590df2b7428125e7644fdd6a65b13888ace8ded2d6e3f6564e72ef122c638b3f9712fac972c5ad4e6085442f1370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-account) \
python3dist(trytond-account) \
trytond_account"

RDEPENDS:${PN} += "python(abi) \
trytond \
trytond_company \
trytond_currency \
trytond_party"

inherit rpm
