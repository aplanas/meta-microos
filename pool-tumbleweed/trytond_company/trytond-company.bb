SUMMARY = "The 'company' module for the Tryton ERP system"
DESCRIPTION = "The company module defines the concepts of company and employee and \
extend the user model in the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.6"

RPM_NAME = "trytond_company-6.0.6-1.8.noarch.rpm"
RPM_HASH = "8fa7c0c155a1632c665300a4ca3423cf5b9b7e5d29d074638072cc75e4832adbd64208d5af04bb97eb4e4f7c2bf48b9dd1124a47ee3ef51a03b00e4c66b5747d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-company \
python3dist-trytond-company \
trytond-company"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-currency \
trytond-party"

inherit rpm
