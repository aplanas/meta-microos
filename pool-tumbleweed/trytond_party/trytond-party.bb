SUMMARY = "The 'party' module for the Tryton ERP system"
DESCRIPTION = "The party module defines the concepts of party, category and contact \
mechanism in the Tryton application platform. It also comes with \
reports to print labels and letters and a 'Check VIES' wizard."
LICENSE = "GPL-3.0-only"

PV = "6.0.4"

RPM_NAME = "trytond_party-6.0.4-1.1.noarch.rpm"
RPM_HASH = "321888f3f9f4a435f27617f1e4dac8e520a150effaf3a76664ab1b0560d214c6d8a9af36ee71732c537064f1847ce63000155353a433a46a77ebb3a6b2d2ef6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-party \
python3dist-trytond-party \
trytond-party"

RDEPENDS:${PN} += "python-abi \
python3-python-stdnum \
trytond \
trytond-country"

inherit rpm
