SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.5"

RPM_NAME = "python39-phonenumbers-8.13.5-1.3.noarch.rpm"
RPM_HASH = "7e35feb0cfb2db4294b2cf7d0496722829e7b02e3d93310247318f810bcbcd05260ecafeb3daaf2b08cb576fc5a82ad70ccc19e5e7645c0d253322a497aea0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(phonenumbers) \
python39-phonenumbers \
python39-phonenumberslite \
python3dist(phonenumbers)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
