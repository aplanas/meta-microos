SUMMARY = "Verify if an email address is valid and really exists"
DESCRIPTION = "Validate_email is a package for Python that check if an email is valid, \
properly formatted and really exists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python39-validate_email-1.3-4.2.noarch.rpm"
RPM_HASH = "e792b2a310df45203565ce5ef783b241056891d276ca2f4c5e311265b05b20366be863a6d7a679495573f3f70d6c66d492226afa96b7d4e32fb87b6fe750a9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-validate-email \
python39-validate-email \
python3dist-validate-email"

RDEPENDS:${PN} += "python-abi"

inherit rpm
