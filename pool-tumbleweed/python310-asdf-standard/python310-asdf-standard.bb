SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-asdf-standard-1.0.3-1.3.noarch.rpm"
RPM_HASH = "73c5e132ca7043ef82c29512acb7a4ddeed0008821a7b04d14ac278837f9e5660fa35d9f18e1d50036e05bcb6ddb3c99597b87ba0fe6a74e2f93c3f31ca0967d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-standard \
python3-asdf_standard \
python3.10dist(asdf-standard) \
python310-asdf-standard \
python310-asdf_standard \
python3dist(asdf-standard)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
