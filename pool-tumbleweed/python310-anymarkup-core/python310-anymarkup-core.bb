SUMMARY = "Core library for anymarkup"
DESCRIPTION = "This is the core library that implements functionality of \
python-anymarkup."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python310-anymarkup-core-0.8.1-3.5.noarch.rpm"
RPM_HASH = "e3350a87beb6f0f83a052bb3ed39f8bdcfbd4b21f5ae1cf10ece501a9ce6e208f1aae70c98ce8a4bed724eade1751fe1609978c8bf9bbaae9d156798ee2399c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-anymarkup-core \
python310-anymarkup-core \
python3dist-anymarkup-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
