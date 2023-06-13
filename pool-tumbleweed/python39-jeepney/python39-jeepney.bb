SUMMARY = "Low-level, pure Python DBus protocol wrapper"
DESCRIPTION = "This is a low-level, pure Python DBus protocol client. It has an I/O-free \
core, and integration modules for different event loops."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-jeepney-0.8.0-2.1.noarch.rpm"
RPM_HASH = "69c39362e9f0f42d2732d3a70948caa4c2bcaeac5a9a7a6ace48f564889caebcccdf6b8a0f2e0248ce5895072ff80f1c6d1f5194eb4187148519b7abce141fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jeepney) \
python39-jeepney \
python3dist(jeepney)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
