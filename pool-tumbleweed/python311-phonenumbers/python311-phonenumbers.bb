SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.5"

RPM_NAME = "python311-phonenumbers-8.13.5-2.3.noarch.rpm"
RPM_HASH = "a0f7b901f99d9f4b60e7be0ba0146dbbc12ff27e65a88e042a4927cd5a8e12d40fa3a2e18598eb42f5a072c287f867b68ab977c35caf7262011512a4ac5999ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phonenumbers \
python3-phonenumberslite \
python3.11dist-phonenumbers \
python311-phonenumbers \
python311-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
