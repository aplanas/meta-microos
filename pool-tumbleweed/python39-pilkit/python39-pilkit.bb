SUMMARY = "A collection of utilities and processors for the Python Imaging Libary"
DESCRIPTION = "PILKit is a collection of utilities for working with PIL (the Python Imaging \
Library). \
 \
One of its main features is a set of **processors** which expose a simple \
interface for performing manipulations on PIL images."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python39-pilkit-2.0-6.8.noarch.rpm"
RPM_HASH = "7827d0a3c71ac34a85c85ed6b07d1f93ebe489afde9e2b46fb67f60f3b2c6b96a78138521956ff9ea51bb926238a8d0fcedc7ad4251e4833eb4c9e3eb18a7013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pilkit \
python39-pilkit \
python3dist-pilkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
