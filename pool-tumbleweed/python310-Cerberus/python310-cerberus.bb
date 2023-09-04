SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.5"

RPM_NAME = "python310-Cerberus-1.3.5-2.1.noarch.rpm"
RPM_HASH = "bdf42797b56194f811c38783ed67ae341cf8b2ca9920c26fd95020d1551b9f7570f4c41145224760dc4a1ed92cde5700adde8d634d81aa64d10379c21d921a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cerberus \
python310-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
