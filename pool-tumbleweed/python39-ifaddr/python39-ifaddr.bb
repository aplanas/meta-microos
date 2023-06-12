SUMMARY = "Module for enumerating IP addresses on system network adapters"
DESCRIPTION = "ifaddr is a Python library that allows finding the \
IP addresses assigned to the system."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-ifaddr-0.2.0-2.3.noarch.rpm"
RPM_HASH = "1462d0a34cf1db45ef3dc31d01c0f029dda8455084883830d497e0d9cb494c5ffd2f3a9640ba70a431931fadddce3cdb8b7d4d5a67920e33e769d82bd6f27d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ifaddr) \
python39-ifaddr \
python3dist(ifaddr)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
