SUMMARY = "Sphinx extension to add a warning banner"
DESCRIPTION = "Sphinx extension to add a warning banner"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python311-sphinx-version-warning-1.1.2-2.1.noarch.rpm"
RPM_HASH = "700740b4acc71ed22166833834519794207c6498caeb8a0567425b2d32b6052e35f139c31c6f9726be36c4eb36b33d05b9f7f4ba3375b3ed88ce35ebe8bb96f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-version-warning \
python311-sphinx-version-warning \
python3dist-sphinx-version-warning"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
