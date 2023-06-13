SUMMARY = "Threading and multiprocessing eye-candy for Python"
DESCRIPTION = "Pebble provides an API to manage threads and processes within an application. \
It wraps Python’s standard library threading and multiprocessing objects."
LICENSE = "LGPL-3.0-only"

PV = "5.0.3"

RPM_NAME = "python39-Pebble-5.0.3-1.3.noarch.rpm"
RPM_HASH = "d36b7ee51e762f4ecf5204e88433e63ad10da26451bc31deea4c28674b4ce1b4c4891cd7b001404f9b1d98828291502d06668fbbdb5e81bebf34c3747b25fedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pebble) \
python39-Pebble \
python3dist(pebble)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
