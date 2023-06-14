SUMMARY = "A library to handle automated deprecations"
DESCRIPTION = "The `deprecation` library provides a `deprecated` decorator and a \
`fail_if_not_removed` decorator for your tests. Together, the two \
enable the automation of several things:"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python310-deprecation-2.1.0-2.12.noarch.rpm"
RPM_HASH = "44864475ac24e66da4b2e0b9815a4fa9413391da58b5754fe1cfbb78b472960b0cb7b1490dc0e34805a030f0ba48bc2244bca2aef881a03976562b3bf3177c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deprecation \
python3.10dist-deprecation \
python310-deprecation \
python3dist-deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
