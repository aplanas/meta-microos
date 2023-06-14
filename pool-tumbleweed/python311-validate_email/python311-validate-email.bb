SUMMARY = "Verify if an email address is valid and really exists"
DESCRIPTION = "Validate_email is a package for Python that check if an email is valid, \
properly formatted and really exists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python311-validate_email-1.3-4.1.noarch.rpm"
RPM_HASH = "c3918d4ac9860e92ad964d00b6d5f715049a09f4abd98fba6cfb320878c73b9175ba5968f94864d15556595fff0204dc86ded084f77c4d66513eed7c523089a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-validate-email \
python311-validate-email \
python3dist-validate-email"

RDEPENDS:${PN} += "python-abi"

inherit rpm
