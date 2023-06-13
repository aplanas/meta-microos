SUMMARY = "The 'company' module for the Tryton ERP system"
DESCRIPTION = "The company module defines the concepts of company and employee and \
extend the user model in the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.6"

RPM_NAME = "trytond_company-6.0.6-1.7.noarch.rpm"
RPM_HASH = "b941bc24870c85ccda668e332900e44d31af5d8331b3983c2d5e67918621eef194e09d46cf955a3a2a3c6f414fd4f9e366640910561ce7088b3eb8e83a70edc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trytond-company) \
python3dist(trytond-company) \
trytond_company"

RDEPENDS:${PN} += "python(abi) \
trytond \
trytond_currency \
trytond_party"

inherit rpm
