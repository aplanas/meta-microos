SUMMARY = "Atomic transactions for TinyDB"
DESCRIPTION = "Atomic transactions for TinyDB."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-tinyrecord-0.2.0-2.9.noarch.rpm"
RPM_HASH = "2566089833701dba0b1d432d4005a8443ad9c3dbc38466bf3c7acfa74328f81df57abdd0abbc5f1165af56526b22daa749c6675075cb5ed2375d03373b8dd18a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tinyrecord \
python39-tinyrecord \
python3dist-tinyrecord"

RDEPENDS:${PN} += "python-abi \
python39-tinydb"

inherit rpm
