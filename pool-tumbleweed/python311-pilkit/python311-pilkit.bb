SUMMARY = "A collection of utilities and processors for the Python Imaging Libary"
DESCRIPTION = "PILKit is a collection of utilities for working with PIL (the Python Imaging \
Library). \
 \
One of its main features is a set of **processors** which expose a simple \
interface for performing manipulations on PIL images."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python311-pilkit-2.0-6.8.noarch.rpm"
RPM_HASH = "6659c356b2ba0913b653c3aa590cdd36d7fc4794918a88365eee23748dbb1a62a863e4d96ea7af0943dc24dc84e6dcb94c8ff14f2314be2342e39e82135a38da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pilkit \
python3.11dist-pilkit \
python311-pilkit \
python3dist-pilkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
