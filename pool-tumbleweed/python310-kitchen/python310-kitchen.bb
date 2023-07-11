SUMMARY = "Kitchen contains a cornucopia of useful code"
DESCRIPTION = "A bunch of useful python functions to be used in other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "python310-kitchen-1.2.6-4.12.noarch.rpm"
RPM_HASH = "c8f3cad0f08e14c707eb2cacd1646a400450f0ca8589f81b2544ad91fa564d8e574faff3d9df55408be455c84442ca19c78f9f64572e9ff5e3dbcd8d223e9a9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kitchen \
python310-kitchen \
python3dist-kitchen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
