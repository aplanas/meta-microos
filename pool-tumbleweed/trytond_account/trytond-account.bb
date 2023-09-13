SUMMARY = "The 'account' module for the Tryton ERP system"
DESCRIPTION = "The accounting module of the Tryton application platform. \
It defines fundamentals for most of accounting needs, such as fiscal year, \
period, account type, journal, tax code and more."
LICENSE = "GPL-3.0+"

PV = "6.0.18"

RPM_NAME = "trytond_account-6.0.18-1.1.noarch.rpm"
RPM_HASH = "4c258e3368276ca0e75dbcf6177416ffd1b88966199c909cac2ae1c55b6ff1a0fe7583de09831d71d83cf5777ffd1476a5e2330a953edcf6029879682adc74e5"
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
