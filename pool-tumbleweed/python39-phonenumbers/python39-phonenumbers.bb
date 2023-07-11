SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.5"

RPM_NAME = "python39-phonenumbers-8.13.5-2.3.noarch.rpm"
RPM_HASH = "e4c80babcf1599a86e2f83f1625d1b4e5cfda75815dcdba2a11a5380df36a27fd34554bae6f7ae87aef0373ebc48dfc1333db837017065483f86ca31d2f955fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-phonenumbers \
python39-phonenumbers \
python39-phonenumberslite \
python3dist-phonenumbers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
