SUMMARY = "Threading and multiprocessing eye-candy for Python"
DESCRIPTION = "Pebble provides an API to manage threads and processes within an application. \
It wraps Python’s standard library threading and multiprocessing objects."
LICENSE = "LGPL-3.0-only"

PV = "5.0.3"

RPM_NAME = "python39-Pebble-5.0.3-1.4.noarch.rpm"
RPM_HASH = "39efb300da0d586f7894010070d99fe3a24527a4276675b6b8e682b504a6ee65aac344c6c71a6852f49b7207320f0526762995dc38fb378c93d067ba840a2eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pebble \
python39-Pebble \
python3dist-pebble"

RDEPENDS:${PN} += "python-abi"

inherit rpm
