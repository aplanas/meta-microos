SUMMARY = "Structured Pipfile and Pipfile.lock models"
DESCRIPTION = "Structured Pipfile and Pipfile.lock models."
LICENSE = "ISC"

PV = "0.4.4"

RPM_NAME = "python39-plette-0.4.4-1.5.noarch.rpm"
RPM_HASH = "d171235ab0e8247e24ee1549bd817a01500a49be992c0791a61a7a4004c8653c1043087297d36b378bf0919e988f998455b1f35121227281fc6bb3677ba88ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-plette \
python39-plette \
python3dist-plette"

RDEPENDS:${PN} += "python-abi \
python39-tomlkit"

inherit rpm
