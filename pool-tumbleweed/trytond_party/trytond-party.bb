SUMMARY = "The 'party' module for the Tryton ERP system"
DESCRIPTION = "The party module defines the concepts of party, category and contact \
mechanism in the Tryton application platform. It also comes with \
reports to print labels and letters and a 'Check VIES' wizard."
LICENSE = "GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "trytond_party-6.0.3-1.5.noarch.rpm"
RPM_HASH = "235fbdf15076bc936b5889d9d72454b87c46de5e11b66a666fe5bb2446e258c0cc4165672786e12efbba9a8b0a17271be30906c7017384e3be90b92702dfd635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-party \
python3dist-trytond-party \
trytond-party"

RDEPENDS:${PN} += "python-abi \
python3-python-stdnum \
trytond \
trytond-country"

inherit rpm
