SUMMARY = "The 'currency' module for the Tryton ERP system"
DESCRIPTION = "The currency module defines the concepts of currency and rate \
in the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "6.0.5"

RPM_NAME = "trytond_currency-6.0.5-1.1.noarch.rpm"
RPM_HASH = "54c484ba7534500270350ae6fe01121acaee7392ea1cc3c54aae038243eebe14a10b50961c5459da253caaa729c4163f583b7810aaab8f92960661aa930d8b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-currency \
python3dist-trytond-currency \
trytond-currency"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
trytond"

inherit rpm
