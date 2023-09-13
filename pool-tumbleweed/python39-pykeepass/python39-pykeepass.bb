SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.6"

RPM_NAME = "python39-pykeepass-4.0.6-1.1.noarch.rpm"
RPM_HASH = "b1a5271f2a3a7bdb126a8a38feb64371f7b0d640c119432a40be3d73e7dea02629e01192bd5fe982e299a6aec1721188f181e25b9a701a6ee6057dc95e45aa97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pykeepass \
python39-pykeepass \
python3dist-pykeepass"

RDEPENDS:${PN} += "python-abi \
python39-argon2-cffi \
python39-construct \
python39-lxml \
python39-pycryptodomex \
python39-python-dateutil"

inherit rpm
