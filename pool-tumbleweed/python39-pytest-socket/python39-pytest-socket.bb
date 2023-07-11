SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-pytest-socket-0.6.0-1.3.noarch.rpm"
RPM_HASH = "f5b635c79987bc8683ce0c0be840729cb55a33ca9b63fade246045ca8994fe6cba794970d7217418f364cbaa1220729292f7a84c2242df3e703aaff8fa2d2e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-socket \
python39-pytest-socket \
python3dist-pytest-socket"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
