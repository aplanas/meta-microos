SUMMARY = "Verify if an email address is valid and really exists"
DESCRIPTION = "Validate_email is a package for Python that check if an email is valid, \
properly formatted and really exists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python311-validate_email-1.3-4.2.noarch.rpm"
RPM_HASH = "d554d35715c1c4a04c8b679ffcf045985e501c6f37159c66bad5c3b532c93a6f8f95c368cd68279badf367e949734a8ddf236f6f574f1cdab2e38bce1bb452f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validate-email \
python3.11dist-validate-email \
python311-validate-email \
python3dist-validate-email"

RDEPENDS:${PN} += "python-abi"

inherit rpm
