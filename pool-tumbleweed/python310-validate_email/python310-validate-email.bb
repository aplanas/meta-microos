SUMMARY = "Verify if an email address is valid and really exists"
DESCRIPTION = "Validate_email is a package for Python that check if an email is valid, \
properly formatted and really exists."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python310-validate_email-1.3-4.2.noarch.rpm"
RPM_HASH = "ec60874d537288de8aba0db54dd72a6069180870c74c3b799e09216bf42c9a7b403fdf69e2a06c775ea2545cb61e0bdda111a1c77a674000387f03610e9c9c12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-validate-email \
python310-validate-email \
python3dist-validate-email"

RDEPENDS:${PN} += "python-abi"

inherit rpm
