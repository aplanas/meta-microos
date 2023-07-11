SUMMARY = "Testing support by jaraco"
DESCRIPTION = "Testing support by jaraco"
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python311-jaraco.test-5.3.0-1.3.noarch.rpm"
RPM_HASH = "4a50f12acba4ce723808338ca9439296a82c892cd9feecaf8005edca11d2e5edbedc416a9b500b6d4e2f40d1580682a5dafe6585f911e6d66e44f2429e2ab405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.test \
python3.11dist-jaraco.test \
python311-jaraco.test \
python3dist-jaraco.test"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.context \
python311-jaraco.functools"

inherit rpm
