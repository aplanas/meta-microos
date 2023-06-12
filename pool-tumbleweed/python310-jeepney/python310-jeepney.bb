SUMMARY = "Low-level, pure Python DBus protocol wrapper"
DESCRIPTION = "This is a low-level, pure Python DBus protocol client. It has an I/O-free \
core, and integration modules for different event loops."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-jeepney-0.8.0-2.1.noarch.rpm"
RPM_HASH = "b44185c1e5a16db2852e11762d951ad7f7fa04421dbe80c18cc1bfc5cf37adfa5447362602088803d03813f3f154e81d21234f00781e9d6a0c164a0b2f4fac97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jeepney \
python3.10dist(jeepney) \
python310-jeepney \
python3dist(jeepney)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
