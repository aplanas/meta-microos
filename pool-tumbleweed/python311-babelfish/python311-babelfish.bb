SUMMARY = "A Python library to work with countries and languages"
DESCRIPTION = "BabelFish is a Python library to work with countries and languages."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-babelfish-0.6.0-1.9.noarch.rpm"
RPM_HASH = "f03f0400d5da6c1f5e935dc7126c8260e3e6981c5fc082c8e4e9a46ff6d7a040004061cf6b85af7438b32d97d23a4cdb6bd4f04d7132787f2440baef1947c23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-babelfish \
python3.11dist-babelfish \
python311-babelfish \
python3dist-babelfish"

RDEPENDS:${PN} += "python-abi"

inherit rpm
