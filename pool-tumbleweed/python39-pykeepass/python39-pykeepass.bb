SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.5"

RPM_NAME = "python39-pykeepass-4.0.5-1.2.noarch.rpm"
RPM_HASH = "22c1ecee9bfdec0539eaee66afcc0dff155f8902f6712e589f5e1adead80cba239c0be36bda52149136dbb7ce83ca9040eb73ab032cda725d30af3191402744e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pykeepass \
python39-pykeepass \
python3dist-pykeepass"

RDEPENDS:${PN} += "python-abi \
python39-argon2-cffi \
python39-construct \
python39-future \
python39-lxml \
python39-pycryptodomex \
python39-python-dateutil"

inherit rpm
