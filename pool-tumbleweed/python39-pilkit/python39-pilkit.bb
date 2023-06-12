SUMMARY = "A collection of utilities and processors for the Python Imaging Libary"
DESCRIPTION = "PILKit is a collection of utilities for working with PIL (the Python Imaging \
Library). \
 \
One of its main features is a set of **processors** which expose a simple \
interface for performing manipulations on PIL images."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python39-pilkit-2.0-6.6.noarch.rpm"
RPM_HASH = "524bb6f5f7c2d4bf23e2ba0c505957915d9bf39029fc9f705c83a5df5e8c887baa9029242ec6a37e6123851d2b29ff6c89b88e1534689385233e51479b574658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pilkit) \
python39-pilkit \
python3dist(pilkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
