SUMMARY = "Threading and multiprocessing eye-candy for Python"
DESCRIPTION = "Pebble provides an API to manage threads and processes within an application. \
It wraps Python’s standard library threading and multiprocessing objects."
LICENSE = "LGPL-3.0-only"

PV = "5.0.3"

RPM_NAME = "python310-Pebble-5.0.3-1.4.noarch.rpm"
RPM_HASH = "31d3fcf1959aa7f990f347a1f13401d108899b8b227d74b681d0485fce205f99c13972a9cb7f73c32de454eb8d966e6ca88f702de016ef5507e603d4687f8322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pebble \
python310-Pebble \
python3dist-pebble"

RDEPENDS:${PN} += "python-abi"

inherit rpm
