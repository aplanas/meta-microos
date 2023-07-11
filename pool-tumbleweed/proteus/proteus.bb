SUMMARY = "A library to access Tryton's modules like a client"
DESCRIPTION = "Proteus allows you to access Tryton's modules like a client. Useful for automation, data load etc."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.8"

RPM_NAME = "proteus-6.0.8-1.3.noarch.rpm"
RPM_HASH = "6d0860222dc849e62507ea1fb6f11011c6995a7910e23f43dc933a0f8a1c5c3306deaffd10dac65336d5f306df9f5ec4561f5267a6ef1dcf6f3cc20ade6d8a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proteus \
python3.11dist-proteus \
python3dist-proteus"

RDEPENDS:${PN} += "python-abi \
python3-dateutil \
trytond"

inherit rpm
