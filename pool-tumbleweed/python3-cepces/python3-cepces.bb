SUMMARY = "Python part of cepces"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
This package provides the Python part for CEP and CES interaction."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.7"

RPM_NAME = "python3-cepces-0.3.7-1.3.noarch.rpm"
RPM_HASH = "582c09e7bf2fc55d4b9fb53b1596bd581cd2c8b968ee63db27339889182ea4cc982596cf3bd15305bac6689fa440c255d7eb42ebdc31759d19d910ba0c138a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cepces \
python3.10dist-cepces \
python3dist-cepces"

RDEPENDS:${PN} += "python-abi \
python3-cryptography \
python3-requests \
python3-requests-gssapi"

inherit rpm
