SUMMARY = "A library to handle automated deprecations"
DESCRIPTION = "The `deprecation` library provides a `deprecated` decorator and a \
`fail_if_not_removed` decorator for your tests. Together, the two \
enable the automation of several things:"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python310-deprecation-2.1.0-2.14.noarch.rpm"
RPM_HASH = "a16e637ba8e919f9b9d9858af554d4c22c83021b5b6cc0e890587bd794dcfb300830b2b5eb929ffc6f95eb101f12e4485873db0918771f8e67ad4e8b8a892371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-deprecation \
python310-deprecation \
python3dist-deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
