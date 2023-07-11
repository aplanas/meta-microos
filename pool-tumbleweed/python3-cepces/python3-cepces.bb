SUMMARY = "Python part of cepces"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
This package provides the Python part for CEP and CES interaction."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.7"

RPM_NAME = "python3-cepces-0.3.7-1.4.noarch.rpm"
RPM_HASH = "be855d096b12013caf80da6424a50135714d79c4d85abcf9be0095504e5cc9a1d4a888885f3791eee0d3e87ba53e2c5f476b2fcc82f961b75349372bc4467f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cepces \
python3.11dist-cepces \
python3dist-cepces"

RDEPENDS:${PN} += "python-abi \
python3-cryptography \
python3-requests \
python3-requests-gssapi"

inherit rpm
