SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.6"

RPM_NAME = "python311-pykeepass-4.0.6-1.1.noarch.rpm"
RPM_HASH = "070ccaed2ae31859cbfdad3284256f519b570ee48e73dbf12ab3c9c3e221b179ea19a4a65134078ff68d432758a756d85d62ed5ad6ee1ceda373e07921907b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykeepass \
python3.11dist-pykeepass \
python311-pykeepass \
python3dist-pykeepass"

RDEPENDS:${PN} += "python-abi \
python311-argon2-cffi \
python311-construct \
python311-lxml \
python311-pycryptodomex \
python311-python-dateutil"

inherit rpm
