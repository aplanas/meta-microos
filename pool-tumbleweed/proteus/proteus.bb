SUMMARY = "A library to access Tryton's modules like a client"
DESCRIPTION = "Proteus allows you to access Tryton's modules like a client. Useful for automation, data load etc."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.8"

RPM_NAME = "proteus-6.0.8-1.1.noarch.rpm"
RPM_HASH = "70d6e67ca00d393ebc765e1fd6ade35167b89c0174091b0e85c98874030f20f6abbafc3587d3ef21e8c036aff22236ca9e54773f052272943c46d524b8a7fe09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proteus \
python3.10dist-proteus \
python3dist-proteus"

RDEPENDS:${PN} += "python-abi \
python3-dateutil \
trytond"

inherit rpm
