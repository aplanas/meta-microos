SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.18"

RPM_NAME = "python310-phonenumbers-8.13.18-1.1.noarch.rpm"
RPM_HASH = "dc73818320252f21ed698ee17fbc73382742e80b4c6037f59a192cc9f03d9c7fcb0f5a53836ef8da79229c4a5235527eacf2a721eb11834d98ef86b10d4f1d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-phonenumbers \
python310-phonenumbers \
python310-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
