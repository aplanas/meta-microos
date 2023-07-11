SUMMARY = "Threading and multiprocessing eye-candy for Python"
DESCRIPTION = "Pebble provides an API to manage threads and processes within an application. \
It wraps Python’s standard library threading and multiprocessing objects."
LICENSE = "LGPL-3.0-only"

PV = "5.0.3"

RPM_NAME = "python311-Pebble-5.0.3-1.4.noarch.rpm"
RPM_HASH = "6e2577e3fdfa68fa2b11f0fe4d83e32cc9d5476d2594b7b9c9a2974e4bc3c84c12aa71b30cda1cf49203d7a658c018a182928abdde825a79f4e093a55c70bce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pebble \
python3.11dist-pebble \
python311-Pebble \
python3dist-pebble"

RDEPENDS:${PN} += "python-abi"

inherit rpm
