SUMMARY = "The 'party' module for the Tryton ERP system"
DESCRIPTION = "The party module defines the concepts of party, category and contact \
mechanism in the Tryton application platform. It also comes with \
reports to print labels and letters and a 'Check VIES' wizard."
LICENSE = "GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "trytond_party-6.0.3-1.4.noarch.rpm"
RPM_HASH = "1b83ba6c3cd071c54cf00fd91d923fcf4f91b46554926f4deeb5113a2e592bd31bcc29f511fa9d88cd5c9bc82dcfdf470cbd8c9860a82ec8def4c27de0e279e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trytond-party \
python3dist-trytond-party \
trytond-party"

RDEPENDS:${PN} += "python-abi \
python3-python-stdnum \
trytond \
trytond-country"

inherit rpm
