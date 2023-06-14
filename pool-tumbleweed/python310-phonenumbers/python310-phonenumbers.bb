SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.5"

RPM_NAME = "python310-phonenumbers-8.13.5-1.3.noarch.rpm"
RPM_HASH = "a081463b66c4ca65b0ef450b87799c95023ceb889d0fa1907d9c63a5c5283e05e66969180c91970f7634175489d9f35bf09da7afe186b2161bf91e41b4238180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phonenumbers \
python3-phonenumberslite \
python3.10dist-phonenumbers \
python310-phonenumbers \
python310-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
