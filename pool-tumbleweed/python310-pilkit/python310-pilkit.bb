SUMMARY = "A collection of utilities and processors for the Python Imaging Libary"
DESCRIPTION = "PILKit is a collection of utilities for working with PIL (the Python Imaging \
Library). \
 \
One of its main features is a set of **processors** which expose a simple \
interface for performing manipulations on PIL images."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python310-pilkit-2.0-6.8.noarch.rpm"
RPM_HASH = "5f2358031db4f5a84b6766dbf4cdbae417164bbdca97a86e0c22303de177a36e25680c415d4857b4eae9154cd09f6688db9e1a80bf9076c4097ca82d36035213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pilkit \
python310-pilkit \
python3dist-pilkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
