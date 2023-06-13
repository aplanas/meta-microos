SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-asdf-standard-1.0.3-1.3.noarch.rpm"
RPM_HASH = "c2b294a85baf171898b753b39094f08953d26d4fff8a0a1709924c8d2ed1720482b6e707436192b9c8eab08118cae5c2f1fafaddc7fb0966402e57e14920792e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asdf-standard) \
python311-asdf-standard \
python311-asdf_standard \
python3dist(asdf-standard)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
