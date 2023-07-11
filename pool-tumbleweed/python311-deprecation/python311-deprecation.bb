SUMMARY = "A library to handle automated deprecations"
DESCRIPTION = "The `deprecation` library provides a `deprecated` decorator and a \
`fail_if_not_removed` decorator for your tests. Together, the two \
enable the automation of several things:"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-deprecation-2.1.0-2.14.noarch.rpm"
RPM_HASH = "61c37db42670b348c78e9f2576b5c8222de9da1f304845dfe9ccd1b3ba06c6bceeab70e65a3e4f141c7ef3f04254ebf1081cefc03fefb9ac613db6612452e916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deprecation \
python3.11dist-deprecation \
python311-deprecation \
python3dist-deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
